package com.oddle.app.weather.service;

import com.oddle.app.weather.dto.OpenWeatherResponse;
import com.oddle.app.weather.dto.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.IOException;

@Service
public class WeatherServiceImpl implements WeatherService {

    WebClient webClient = WebClient.create("https://api.openweathermap.org/data/2.5");


    @Override
    public WeatherResponse getCurrent(String city) {

        OpenWeatherResponse res = webClient.get()
                .uri("/weather?q="+ city +"&appid=ac0f3d4cc8ab37ae0e3a6c0eb9d8afc8")
                .retrieve()
                .bodyToMono(OpenWeatherResponse.class)
                .block();

        assert res != null;
        return WeatherResponse.builder()
                .city(res.getName())
                .temperature(res.getMain().temp)
                .country(res.sys.country)
                .timeZone(res.timezone)
                .weather(res.weather)
                .build();
    }
}
