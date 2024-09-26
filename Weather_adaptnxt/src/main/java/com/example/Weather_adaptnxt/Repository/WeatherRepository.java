package com.example.Weather_adaptnxt.Repository;

import com.example.Weather_adaptnxt.Entity.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<Weather,Long> {
}
