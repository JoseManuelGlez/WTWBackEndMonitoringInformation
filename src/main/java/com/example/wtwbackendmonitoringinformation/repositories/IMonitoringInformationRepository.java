package com.example.wtwbackendmonitoringinformation.repositories;

import com.example.wtwbackendmonitoringinformation.entities.MonitoringInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMonitoringInformationRepository extends JpaRepository <MonitoringInformation, Long> {

}
