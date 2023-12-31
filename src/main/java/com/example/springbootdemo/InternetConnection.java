package com.example.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class InternetConnection {
	private String IpAddress;
	private int Speed;
	public String getIpAddress() {
		return IpAddress;
	}


	public void setIpAddress(String ipAddress) {
		IpAddress = ipAddress;
	}


	public int getSpeed() {
		return Speed;
	}


	public void setSpeed(int speed) {
		Speed = speed;
	}

	public void switchOn() {
		System.out.println("Switching On Internet.");
	}


	public static void main(String[] args) {
		
	}

}
