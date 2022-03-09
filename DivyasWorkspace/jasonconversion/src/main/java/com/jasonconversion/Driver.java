package com.jasonconversion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) throws JsonProcessingException {
		//build java object		
		Customer cust = new Customer(212,"Dhivya","Lincoln");
		//ObjectMapper objectmapper = new ObjectMapper();
		String json = Util.javaToJasonConversion(cust);
		System.out.println(json);
		
		String jsonstr ="{\"cno\":212,\"cname\":\"Dhivya\",\"loc\":\"Lincoln\"}\n"
				+ "";
		
		ObjectMapper om = new ObjectMapper();

		com.jasonconversion.Customer c = om.readValue(json, Customer.class);

		System.out.println(c.getCno()+ " "+ c.getCname()+ " "+ c.getLoc());
		
	}

}
