package com.example.webscrapingapi.controller;

import com.example.webscrapingapi.model.ResponseDTO;
import com.example.webscrapingapi.service.ScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
@RequestMapping(path = "/")
@RestController
public class ScraperController {
  @Autowired
    ScraperService scraperService;

    @GetMapping(path = "/{vehicleModel}")
    public Set<ResponseDTO> getVehicleByModel(@PathVariable String vehicleModel) {
        return  scraperService.getVehicleByModel(vehicleModel);
    }
}
