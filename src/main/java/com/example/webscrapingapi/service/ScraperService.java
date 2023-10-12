package com.example.webscrapingapi.service;

import com.example.webscrapingapi.model.ResponseDTO;

import java.util.Set;

public interface ScraperService {
    public Set<ResponseDTO> getVehicleByModel(String vehicleModel);


}
