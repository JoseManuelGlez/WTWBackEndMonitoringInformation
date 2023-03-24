package com.example.wtwbackendmonitoringinformation.repositories;

import com.example.wtwbackendmonitoringinformation.entities.projections.IMonitoringInformationProjection;
import com.example.wtwbackendmonitoringinformation.entities.MonitoringInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IMonitoringInformationRepository extends JpaRepository<MonitoringInformation, Long> {
    @Query(value = "SELECT * FROM monitoring_information WHERE monitoring_information.esp_id = :espId", nativeQuery = true)
    IMonitoringInformationProjection findByEsp32Id(Long espId);
}
