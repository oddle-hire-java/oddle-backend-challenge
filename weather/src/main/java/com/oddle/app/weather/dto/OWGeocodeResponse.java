package com.oddle.app.weather.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class OWGeocodeResponse {
        @JsonProperty("name")
        private String name;
        @JsonProperty("lat")
        private double lat;
        @JsonProperty("lon")
        private double lon;
        @JsonProperty("country")
        private String country;
        @JsonProperty("state")
        private String state;
}
