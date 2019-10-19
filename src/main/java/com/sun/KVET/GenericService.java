package com.sun.KVET;

/**
 * Auther : lirao
 * Description:
 * Date: create in  19-8-25  上午11:57
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public  class GenericService{
    @Resource
    private AnimalLists animalLists;



    public <T,K> void testGeneric(List<? extends T> lists,K k){
        for (T t : lists){
            System.out.println(t);
        }
    }


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/ssm/spring-service.xml");
        GenericService geneicService =(GenericService) context.getBean("genericService");
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(1);
        objects.add("2");
        geneicService.testGeneric(objects, new String());
    }

}
