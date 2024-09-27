package com.example.Weather_Information_Service_2.Service;
import com.example.Weather_Information_Service_2.Entity.Weather;
import com.example.Weather_Information_Service_2.Repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {

    // This method should be implemented to fetch weather data from your data source
    @Autowired
    private WeatherRepository weatherRepository;

    public Weather getWeatherByCity(String city) {
        List<Weather> weathers= weatherRepository.findAll();
        for (Weather weather:weathers){
            if (weather.getCity().toLowerCase().equals(city.toLowerCase())){
                return weather;
            }
        }
        return null;
    }
}

