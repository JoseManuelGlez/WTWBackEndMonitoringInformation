package com.example.wtwbackendmonitoringinformation.repositories;

import com.example.wtwbackendmonitoringinformation.entities.MonitoringInformation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMonitoringInformationRepository extends MongoRepository<MonitoringInformation, String> {

}
