package com.javatechie.aws.api.model;

import java.util.List;

public class ModelResponse {
	
	private List<Model> models;
	private List<ModelYear> modelYears;
	
	public List<Model> getModels() {
		return models;
	}
	public void setModels(List<Model> models) {
		this.models = models;
	}
	public List<ModelYear> getModelYears() {
		return modelYears;
	}
	public void setModelYears(List<ModelYear> modelYears) {
		this.modelYears = modelYears;
	}
	
	

}
