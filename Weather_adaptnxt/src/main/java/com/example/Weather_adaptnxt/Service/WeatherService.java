package com.example.Weather_adaptnxt.Service;


import com.example.Weather_adaptnxt.Entity.Weather;
import com.example.Weather_adaptnxt.Repository.WeatherRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {
    @Autowired
    private WeatherRepository weatherRepository;

    public List<Weather> getAllWeather() {
        return weatherRepository.findAll();
    }

    public Weather getWeatherById(Long id) {
        return weatherRepository.findById(id).orElse(null);
    }

    public Weather saveWeather(Weather weather) {
        return weatherRepository.save(weather);
    }

    public void deleteWeather(Long id) {
        weatherRepository.deleteById(id);
    }
}

