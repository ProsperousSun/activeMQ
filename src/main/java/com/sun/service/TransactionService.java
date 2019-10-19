package com.sun.service;

import com.sun.dao.AnimalMapper;
import com.sun.dao.PersonMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class TransactionService {
    @Resource
    private AnimalMapper animalMapper;
    @Resource
    private PersonMapper personMapper;


    //@Transactional(rollbackFor = RuntimeException.class)
    public String insert(){

        animalMapper.insert("2",2);

        personMapper.insert("2",2);

//        if (1==1)
//        throw new RuntimeException("ssss");

        return "ok";
    }
    @Transactional(rollbackFor = RuntimeException.class)
    public void test(){
        insert();
        if (1==1)
            throw new RuntimeException("aaaa");
    }

    public static void main(String[] args) {

    }
}
