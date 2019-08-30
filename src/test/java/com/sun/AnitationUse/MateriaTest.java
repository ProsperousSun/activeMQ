package com.sun.AnitationUse;

import com.sun.BaseTest;
import com.sun.KVET.Cat;
import com.sun.KVET.Dog;
import com.sun.KVET.GenericAgain.DogMateria;
import com.sun.KVET.GenericAgain.Materia;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * Auther : lirao
 * Description:
 * Date: create in  19-8-29  下午8:57
 */
public class MateriaTest extends BaseTest {

    @Resource
    private Materia dogMateria;

    @Resource
    private Materia catMateria;

    @Test
    public void dogMateriaTest(){
//        List getall = dogMateria.getall();
        List<Dog> getall = dogMateria.getall();
        System.out.println(getall.size());

//        List getall1 = catMateria.getall();
        List<Cat> getall1 = catMateria.getall();
        System.out.println(getall1.size());

    }
}
