package com.sun.KVET;

import org.springframework.stereotype.Service;

/**
 * Auther : lirao
 * Description:
 * Date: create in  19-8-25  下午1:51
 */
@Service
public class DogService implements AnimalService{

    @Override
    public AniamlEnum bizType(){
        return AniamlEnum.Dog;
    }

    @Override
    public void say(){
        System.out.println("I'm a Dog");
    }
}
