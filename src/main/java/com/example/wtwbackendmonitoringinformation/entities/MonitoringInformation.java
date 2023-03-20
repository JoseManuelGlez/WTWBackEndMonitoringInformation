package com.example.wtwbackendmonitoringinformation.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="MonitoringInformation")
public class MonitoringInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;
    private String hour;
    private String soilTemperature;
    private String soilHumidity;
    private String ambientTemperature;
    private String ambientHumidity;
}
