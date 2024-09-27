package com.example.Weather_Information_Service_2.Repository;

import com.example.Weather_Information_Service_2.Entity.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WeatherRepository extends JpaRepository<Weather,Integer> {

}
