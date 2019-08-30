package com.sun.KVET;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Auther : lirao
 * Description:
 * Date: create in  19-8-25  下午1:48
 */
@Service
public class AnimalLists {

    private Map<AniamlEnum,AnimalService> animalServiceMap = new HashMap();

    @Resource
    public List<AnimalService> animalServiceList;

    @PostConstruct
    public void start(){
        for (AnimalService animalService : animalServiceList){
            animalServiceMap.put(animalService.bizType(),animalService);
        }
    }

    public AnimalService getAnimalServvice(AniamlEnum aniamlEnum){
        return animalServiceMap.get(aniamlEnum);
    }



}
