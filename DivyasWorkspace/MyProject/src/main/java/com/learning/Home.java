package com.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Home {

	private String Owner;
	private int doorno;
	
	@Autowired
	private InternetConnection modem;
	public Home() {
		System.out.println("Home Constructor");
	}
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String owner) {
		Owner = owner;
	}
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public void connect() {
		modem.switchOn();
		System.out.println("Connecting to Internet");
	}
}
