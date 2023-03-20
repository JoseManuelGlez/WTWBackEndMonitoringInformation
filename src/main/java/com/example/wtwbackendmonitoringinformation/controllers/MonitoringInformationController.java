package com.example.wtwbackendmonitoringinformation.controllers;

import com.example.wtwbackendmonitoringinformation.controllers.dtos.requests.CreateMonitoringInformationRequest;
import com.example.wtwbackendmonitoringinformation.controllers.dtos.responses.BaseResponse;
import com.example.wtwbackendmonitoringinformation.services.interfaces.IMonitoringInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("monitoring-information")
public class MonitoringInformationController {
    @Autowired
    private IMonitoringInformationService service;

    @PostMapping()
    public BaseResponse create(@RequestBody CreateMonitoringInformationRequest request) {
        return service.create(request);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
