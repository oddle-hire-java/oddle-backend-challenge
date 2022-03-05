package com.oddle.app.weather.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.oddle.app.weather.dto.HistoricalWeatherResponse;
import com.oddle.app.weather.dto.WeatherResponse;
import com.oddle.app.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

@RestController
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("")
    public Map<String, Object> getWeathers() {
        return Collections.singletonMap("message", "Welcome to Oddle Backend Challenge");
    }

    @GetMapping("/api/v1/weather")
    public WeatherResponse getCurrentWeather(@RequestParam("city") String city) throws IOException {
        return weatherService.getCurrent(city);
    }

    @GetMapping("/api/v1/historical-weather")
    public HistoricalWeatherResponse getHistoricalWeather(@RequestParam("city") String city,
                                                          @RequestParam("date") String date) throws JsonProcessingException {
        return weatherService.getHistorical(city, date);
    }
}