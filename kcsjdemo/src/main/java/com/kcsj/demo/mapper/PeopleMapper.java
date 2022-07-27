package com.kcsj.demo.mapper;

import com.kcsj.demo.entity.People;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PeopleMapper {

    @Select("select * from people")
    public List<People> findAll();
}
