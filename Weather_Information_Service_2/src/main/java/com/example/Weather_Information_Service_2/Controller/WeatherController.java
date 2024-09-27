package com.example.Weather_Information_Service_2.Controller;



import com.example.Weather_Information_Service_2.Entity.Weather;
import com.example.Weather_Information_Service_2.Service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/search")
    public String searchWeather() {
        return "search";
    }

    @GetMapping("/result")
    public String showWeather(@RequestParam("city") String city, Model model) {
        Weather weather = weatherService.getWeatherByCity(city);
        model.addAttribute("weather", weather);
        return "result";
    }
}


