package com.example.wtwbackendmonitoringinformation.repositories;

import com.example.wtwbackendmonitoringinformation.entities.projections.IMonitoringInformationProjection;
import com.example.wtwbackendmonitoringinformation.entities.MonitoringInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IMonitoringInformationRepository extends JpaRepository<MonitoringInformation, Long> {
    @Query(value = "SELECT monitoring_information.id AS monitoringInformationId, " +
            "monitoring_information.date AS monitoringInformationDate," +
            "monitoring_information.hour AS monitoringInformationHour, " +
            "monitoring_information.soil_temperature AS monitoringInformationSoilTemperature, " +
            "monitoring_information.soil_humidity AS monitoringInformationSoilHumidity, " +
            "monitoring_information.ambient_temperature AS monitoringInformationAmbientTemperature, " +
            "monitoring_information.ambient_humidity AS monitoringInformationAmbientHumidity, " +
            "monitoring_information.esp_id AS monitoringInformationEspId " +
            "FROM monitoring_information " +
            "WHERE monitoring_information.esp_id = :espId ;", nativeQuery = true)
    IMonitoringInformationProjection findByEsp32Id(Long espId);
}
