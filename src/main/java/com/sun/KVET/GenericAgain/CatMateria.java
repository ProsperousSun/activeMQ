package com.sun.KVET.GenericAgain;

import com.sun.KVET.Cat;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Auther : lirao
 * Description:
 * Date: create in  19-8-29  下午8:52
 */
@Service
public class CatMateria extends Materia<Cat> {
    @Override
    public List<Cat> getAnimals() {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }
}
