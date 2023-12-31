package com.example.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype") // Scope using for many times running constructor
public class Home {
	
	public Home() {
		System.out.println("Home Home");
	}
	
	private String owner;
	private int doorNo;
	
	@Autowired
	private InternetConnection modem; // create object in InternetConnection class
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	
	public void connect() {
		modem.switchOn();
		System.out.println("Connecting to network");
	}
	

}
