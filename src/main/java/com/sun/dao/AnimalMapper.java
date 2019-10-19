package com.sun.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalMapper {

    int insert(@Param("name") String name,@Param("size") int size);
}
