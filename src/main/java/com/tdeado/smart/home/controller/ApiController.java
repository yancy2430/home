package com.tdeado.smart.home.controller;

import com.tdeado.smart.home.service.FishTankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/")
public class ApiController {
    @Autowired
    FishTankService fishTankService;

    @RequestMapping("/getTemperature")
    public Double getTemperature(){
        BigDecimal bg = new BigDecimal(Math.random()).multiply(new BigDecimal(100));
        double f1 = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return f1;
    }

}
