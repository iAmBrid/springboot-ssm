package com.duoyi.springbootssm.controller;

import com.duoyi.springbootssm.dao.CityDao;
import com.duoyi.springbootssm.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CityRestController {

    @Autowired
    private CityDao cityMapper;

    public CityRestController(CityDao cityMapper) {
        this.cityMapper = cityMapper;
    }

    @RequestMapping("/cities")
    City getCity() {
        return cityMapper.findByState();
    }
}
