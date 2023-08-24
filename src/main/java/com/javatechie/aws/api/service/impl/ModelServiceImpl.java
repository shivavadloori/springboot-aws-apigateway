package com.javatechie.aws.api.service.impl;

import org.springframework.stereotype.Service;

import com.javatechie.aws.api.model.ModelResponse;
import com.javatechie.aws.api.service.ModelService;
import com.javatechie.aws.api.service.utils.ObjectMapperUtils;

@Service
public class ModelServiceImpl implements ModelService {

	@Override
	public ModelResponse getModelsByBrand(String brand) {
		return ObjectMapperUtils.getModelsFromJson(brand);
	}

	@Override
	public ModelResponse getModelYearsByModel(String model_Id) {
		// TODO Auto-generated method stub
		return ObjectMapperUtils.getModelYearsByModeId("modelId");
	}

}
