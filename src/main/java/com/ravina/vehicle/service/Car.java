package com.ravina.vehicle.service;

import org.springframework.stereotype.Service;

@Service
public class Car implements Vehicle {

	public String model() {

		System.out.println("vehicle registration place:"+registration_place);

		System.out.println("vehicle color:"+vehicle_color);
		
		return "Vehicle Model:"+"BMW";
		
	}

	
}
