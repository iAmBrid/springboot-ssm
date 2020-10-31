package com.duoyi.springbootssm.mapper;

import com.duoyi.springbootssm.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityMapper {

    @Select("select id,name,state,country from city where id=1")
    City findByState();
}
