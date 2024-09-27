package com.example.Weather_Information_Service_2.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String city;
    private int temperature;
    private int humidity;
    private String weather_description;
    private double wind_speed;
    private int pressure;

    // Constructor
    public Weather(String city, int temperature, int humidity, String weather_description, double wind_speed, int pressure) {
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
        this.weather_description = weather_description;
        this.wind_speed = wind_speed;
        this.pressure = pressure;
    }
    public Weather() {}
    // Getters and Setters
    public Integer getId(){return id;}
    public String getCity() { return city; }
    public int getTemperature() { return temperature; }
    public int getHumidity() { return humidity; }
    public String getWeather_description() { return weather_description; }
    public double getWind_speed() { return wind_speed; }
    public int getPressure() { return pressure; }
}

