package com.duoyi.springbootssm.controller;

import com.duoyi.springbootssm.domain.City;
import com.duoyi.springbootssm.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CityRestController {

    @Autowired
    private CityMapper cityMapper;

    public CityRestController(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @RequestMapping("/cities")
    City getCity() {
        return cityMapper.findByState();
    }
}
