package com.ravina.vehicle.service;

import org.springframework.stereotype.Service;

@Service
public class Bike implements Vehicle {
	
public String model() {
	
	System.out.println("Vehicle Registration Place:"+registration_place);

	System.out.println("Vehicle Color:"+vehicle_color);
		
		return "vehicle Model:"+"PULSER";
	}

	
}
