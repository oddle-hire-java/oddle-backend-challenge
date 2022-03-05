package com.oddle.app.weather.service;

import com.oddle.app.weather.dto.WeatherResponse;

import java.io.IOException;

public interface WeatherService {
    WeatherResponse getCurrent(String city);
}
