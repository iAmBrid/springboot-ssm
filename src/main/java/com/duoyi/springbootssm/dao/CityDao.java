package com.duoyi.springbootssm.dao;

import com.duoyi.springbootssm.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityDao {

    @Select("select id,name,state,country from city where id=1")
    City findByState();
}
