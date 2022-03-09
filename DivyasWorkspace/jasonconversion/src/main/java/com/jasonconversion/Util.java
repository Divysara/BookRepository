package com.jasonconversion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Util {

	
	public static String javaToJasonConversion(Object obj) throws JsonProcessingException {
		
		ObjectMapper objectmapper = new ObjectMapper();
		String json = objectmapper.writeValueAsString(obj);
		return json;
		
	}
	public static Object jasonToJavaConversion(String json) throws JsonMappingException, JsonProcessingException {
		
		ObjectMapper objectmapper = new ObjectMapper();
		Object obj = objectmapper.readValue(json, Object.class);
		return obj;
		
	}
	
}
