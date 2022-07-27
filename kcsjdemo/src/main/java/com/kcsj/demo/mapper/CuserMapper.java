package com.kcsj.demo.mapper;

import com.kcsj.demo.entity.Cuser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface CuserMapper {

    @Select("select * from c_user")
    List<Cuser> selectAllInfo();
}
