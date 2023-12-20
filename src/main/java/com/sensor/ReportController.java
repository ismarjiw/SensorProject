package com.sensor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

    private final SensorService sensorService;

    @Autowired
    public ReportController(SensorService sensorService) {
        this.sensorService = sensorService;
    }
}
