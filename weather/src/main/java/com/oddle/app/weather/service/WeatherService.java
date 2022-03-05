package com.oddle.app.weather.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.oddle.app.weather.dto.HistoricalWeatherResponse;
import com.oddle.app.weather.dto.WeatherResponse;

public interface WeatherService {
    WeatherResponse getCurrent(String city);
    HistoricalWeatherResponse getHistorical(String city, String date) throws JsonProcessingException;
}
