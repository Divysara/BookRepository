package com.jasonconversion;

public class Customer {

	int cno;
	String cname;
	String loc;
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Customer(int cno, String cname, String loc) {
		
		this.cno = cno;
		this.cname = cname;
		this.loc = loc;
	}
	public Customer() {
	
}
}
