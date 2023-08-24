package com.javatechie.aws.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.aws.api.model.ModelResponse;
import com.javatechie.aws.api.service.ModelService;

@RestController
@RequestMapping("/model")
public class ModelController {
	
	@Autowired
	private ModelService modelService;
	
	
	@GetMapping(value="getModelsByBrandId",produces = MediaType.APPLICATION_JSON_VALUE)
    public ModelResponse getModelsByBrand() {
        return modelService.getModelsByBrand("brandId");
    }
	
	@GetMapping(value="getModelYearsByModelId",produces = MediaType.APPLICATION_JSON_VALUE)
    public ModelResponse getModelYearsByModelId() {
        return modelService.getModelYearsByModel("brandId");
    }


}
