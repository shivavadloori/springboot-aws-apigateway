package com.javatechie.aws.api.service;


import com.javatechie.aws.api.model.ModelResponse;

public interface ModelService {

	public ModelResponse getModelsByBrand(String brand);
	
	public ModelResponse getModelYearsByModel(String model_Id);
}
