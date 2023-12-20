package com.sensor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Data Access Layer
@Repository
public interface SensorDataRepository extends JpaRepository<Sensor, Long> {

}
