package com.example.wtwbackendmonitoringinformation.entities.projections;

public interface IMonitoringInformationProjection {
    Long getMonitoringInformationId();

    String getMonitoringInformationDate();

    String getMonitoringInformationHour();

    String getMonitoringInformationSoilTemperature();

    String getMonitoringInformationSoilHumidity();

    String getMonitoringInformationAmbientTemperature();

    String getMonitoringInformationAmbientHumidity();

    Long getMonitoringInformationEspId();
}
