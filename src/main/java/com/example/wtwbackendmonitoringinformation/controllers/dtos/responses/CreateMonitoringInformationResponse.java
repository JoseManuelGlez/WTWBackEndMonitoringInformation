package com.example.wtwbackendmonitoringinformation.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class CreateMonitoringInformationResponse {
    private Long id;
    private String date;
    private String hour;
    private String soilTemperature;
    private String soilHumidity;
    private String ambientTemperature;
    private String ambientHumidity;
    private Long espId;
}
