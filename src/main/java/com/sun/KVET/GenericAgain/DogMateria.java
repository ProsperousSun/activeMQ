package com.sun.KVET.GenericAgain;

import com.sun.KVET.Dog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Auther : lirao
 * Description:
 * Date: create in  19-8-29  下午8:48
 */
@Service
public class DogMateria extends Materia<Dog> {


    @Override
    public List<Dog> getAnimals() {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        return dogs;
    }
}
