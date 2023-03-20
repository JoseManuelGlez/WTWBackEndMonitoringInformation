package com.example.wtwbackendmonitoringinformation.services;

import com.example.wtwbackendmonitoringinformation.controllers.dtos.requests.CreateMonitoringInformationRequest;
import com.example.wtwbackendmonitoringinformation.controllers.dtos.responses.BaseResponse;
import com.example.wtwbackendmonitoringinformation.controllers.dtos.responses.CreateMonitoringInformationResponse;
import com.example.wtwbackendmonitoringinformation.entities.MonitoringInformation;
import com.example.wtwbackendmonitoringinformation.repositories.IMonitoringInformationRepository;
import com.example.wtwbackendmonitoringinformation.services.interfaces.IMonitoringInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

public class MonitoringInformationServiceImpl implements IMonitoringInformationService {
    @Autowired
    private IMonitoringInformationRepository repository;


    @Override
    public BaseResponse create(CreateMonitoringInformationRequest request) {
        MonitoringInformation user = from(request);

        return BaseResponse.builder()
                .data(from(repository.save(user)))
                .message("User created correctly")
                .success(Boolean.TRUE)
                .httpStatus(HttpStatus.CREATED).build();
    }

    @Override
    public void delete(Long id) {
        repository.delete(findAndEnsureExist(id));
    }

    private MonitoringInformation from(CreateMonitoringInformationRequest request) {
        MonitoringInformation monitoringInformation = new MonitoringInformation();

        monitoringInformation.setDate(request.getDate());
        monitoringInformation.setHour(request.getHour());
        monitoringInformation.setSoilTemperature(request.getSoilTemperature());
        monitoringInformation.setSoilHumidity(request.getSoilHumidity());
        monitoringInformation.setAmbientTemperature(request.getAmbientTemperature());
        monitoringInformation.setAmbientHumidity(request.getAmbientHumidity());
        return monitoringInformation;
    }

    private CreateMonitoringInformationResponse from(MonitoringInformation monitoringInformation){
        CreateMonitoringInformationResponse createMonitoringInformationResponse = new CreateMonitoringInformationResponse();

        createMonitoringInformationResponse.setId(monitoringInformation.getId());
        createMonitoringInformationResponse.setDate(monitoringInformation.getDate());
        createMonitoringInformationResponse.setHour(monitoringInformation.getHour());
        createMonitoringInformationResponse.setSoilTemperature(monitoringInformation.getSoilTemperature());
        createMonitoringInformationResponse.setSoilHumidity(monitoringInformation.getSoilHumidity());
        createMonitoringInformationResponse.setAmbientTemperature(monitoringInformation.getAmbientTemperature());
        createMonitoringInformationResponse.setAmbientHumidity(monitoringInformation.getAmbientHumidity());
        return createMonitoringInformationResponse;
    }

    private MonitoringInformation findAndEnsureExist(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
    }
}
