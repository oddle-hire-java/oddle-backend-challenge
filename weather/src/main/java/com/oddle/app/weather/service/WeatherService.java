package com.oddle.app.weather.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.oddle.app.weather.dto.HistoricalDto;
import com.oddle.app.weather.dto.WeatherResponse;

public interface WeatherService {
    WeatherResponse getCurrent(String city);
    HistoricalDto getHistorical(String city, String date) throws JsonProcessingException;
}
