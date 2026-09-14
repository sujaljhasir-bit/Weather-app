package com.cfs.Weather_app.controller;

import com.cfs.Weather_app.dto.Root;
import com.cfs.Weather_app.dto.weather_response;
import com.cfs.Weather_app.service.weather_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class controller {
    @Autowired
    private weather_service service;
    @GetMapping("/{city}")
    public String getweatherdata(@PathVariable String city){
        return service.test();
    }
    @GetMapping("/my/{city}")
    public weather_response getweatherapi(@PathVariable String city){
        return service.getData(city);
    }
}
