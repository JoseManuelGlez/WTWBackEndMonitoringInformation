package com.example.wtwbackendmonitoringinformation.services.interfaces;

import com.example.wtwbackendmonitoringinformation.controllers.dtos.requests.CreateMonitoringInformationRequest;
import com.example.wtwbackendmonitoringinformation.controllers.dtos.responses.BaseResponse;

public interface IMonitoringInformationService {
    BaseResponse create(CreateMonitoringInformationRequest request);

    void delete(Long id);

    BaseResponse findByEsp32Id(Long espId);
}
