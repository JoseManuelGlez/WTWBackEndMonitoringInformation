package com.example.wtwbackendmonitoringinformation.services.interfaces;

import com.example.wtwbackendmonitoringinformation.controllers.dtos.requests.CreateMonitoringInformationRequest;
import com.example.wtwbackendmonitoringinformation.controllers.dtos.responses.BaseResponse;
import org.springframework.stereotype.Service;

@Service
public interface IMonitoringInformationService {
    BaseResponse create(CreateMonitoringInformationRequest request);

    void delete(Long id);
}
