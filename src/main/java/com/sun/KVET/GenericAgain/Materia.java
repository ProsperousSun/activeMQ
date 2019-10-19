package com.sun.KVET.GenericAgain;

import com.sun.KVET.Cat;
import com.sun.KVET.Dog;

import java.util.ArrayList;
import java.util.List;

/**
 * Auther : lirao
 * Description:
 * Date: create in  19-8-29  下午8:22
 */
public abstract class Materia<T> {


    protected abstract List<T> getAnimals();


    public List<T> getall(){
        return getAnimals();
    }
}
