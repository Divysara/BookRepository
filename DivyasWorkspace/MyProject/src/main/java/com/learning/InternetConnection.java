package com.learning;

import org.springframework.stereotype.Component;

@Component
public class InternetConnection {
	
	private String name;
	private int ipaddress;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(int ipaddress) {
		this.ipaddress = ipaddress;
	}
	public void switchOn() {
		System.out.println("Switching On");
	}

}
