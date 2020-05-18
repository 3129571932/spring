package com.hxc.demo.dao;

import com.hxc.demo.entity.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonDao {
    void insertIntoPerson(Person person);
}
