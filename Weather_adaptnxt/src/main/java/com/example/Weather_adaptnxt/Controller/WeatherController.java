package com.example.Weather_adaptnxt.Controller;


import com.example.Weather_adaptnxt.Entity.Weather;
import com.example.Weather_adaptnxt.Service.WeatherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;


    @GetMapping
    public List<Weather> getAllWeather() {
        return weatherService.getAllWeather();
    }

    @GetMapping("/{id}")
    public Weather getWeatherById(@PathVariable Long id) {
        return weatherService.getWeatherById(id);
    }

    @PostMapping
    public Weather saveWeather(@RequestBody Weather weather) {
        return weatherService.saveWeather(weather);
    }

    @DeleteMapping("/{id}")
    public void deleteWeather(@PathVariable Long id) {
        weatherService.deleteWeather(id);
    }
}
