package com.tdeado.smart.home.hardware.fishtank;

import org.springframework.stereotype.Service;

@Service
public class FishtankTemperatureSensorService {
    /**
     * 获取温度
     * @return
     */
    public Double getTemperature(){
        return Math.random();
    }
}
