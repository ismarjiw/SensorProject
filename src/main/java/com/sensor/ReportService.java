package com.sensor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    private final SensorRepository sensorRepository;

    @Autowired
    public ReportService(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }
}
