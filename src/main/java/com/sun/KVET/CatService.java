package com.sun.KVET;

import org.springframework.stereotype.Service;

/**
 * Auther : lirao
 * Description:
 * Date: create in  19-8-25  下午1:52
 */
@Service
public class CatService implements AnimalService{

    @Override
    public AniamlEnum bizType(){
        return AniamlEnum.CAT;
    }

    @Override
    public void say(){
        System.out.println("I'm a Cat");
    }
}
