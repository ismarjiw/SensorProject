package com.sensor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorDataController {

    private final SensorService sensorService;

    @Autowired
    public SensorDataController(SensorService sensorService) {
        this.sensorService = sensorService;
    }
}
