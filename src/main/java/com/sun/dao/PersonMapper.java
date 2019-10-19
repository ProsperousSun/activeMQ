package com.sun.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonMapper {
    int insert(@Param("name") String name,@Param("age") Integer age);
}
