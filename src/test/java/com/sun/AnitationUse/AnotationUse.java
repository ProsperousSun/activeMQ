package com.sun.AnitationUse;

import com.sun.BaseTest;
import com.sun.KVET.AniamlEnum;
import com.sun.KVET.AnimalLists;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Auther : lirao
 * Description:
 * Date: create in  19-8-25  下午2:08
 */
public class AnotationUse extends BaseTest {


    @Resource
    private AnimalLists animalLists;

    @Test
    public void testIanimals(){
        animalLists.getAnimalServvice(AniamlEnum.CAT).say();
    }
}
