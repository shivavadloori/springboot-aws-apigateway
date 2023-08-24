package com.javatechie.aws.api.service.utils;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.FileCopyUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javatechie.aws.api.model.ModelResponse;



public class ObjectMapperUtils {
	
	private static String readFileFromResources(String fileName) throws IOException {
		ResourceLoader resourceLoader = new DefaultResourceLoader();
		Resource resource = resourceLoader.getResource("classpath:"+fileName);
		try (Reader reader = new InputStreamReader(resource.getInputStream(), StandardCharsets.UTF_8)) {
            return FileCopyUtils.copyToString(reader);
        } catch (IOException e) {
            return StringUtils.EMPTY;
        }
	}
	public static ModelResponse getModelsFromJson(String brandId){
		return getModelResponse("modelJson.json");
	}
	
	public static ModelResponse getModelYearsByModeId(String modelId) {
		return getModelResponse("modelYearJson.json");
	}
	
	private static ModelResponse getModelResponse(String filePath) {
		ObjectMapper mapper=new ObjectMapper();
		try {
			String modelResponseJson=readFileFromResources(filePath);
			return mapper.readValue(modelResponseJson, ModelResponse.class);
		}catch(Exception ex) {
			return new ModelResponse();
		}
	}
}
