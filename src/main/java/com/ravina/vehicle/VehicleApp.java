package com.ravina.vehicle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ravina.vehicle.controller.VehicleController;
import com.ravina.vehicle.service.Car;
import com.ravina.vehicle.service.Vehicle;

@Configuration
public class VehicleApp {
	
@Bean
public VehicleController getCar3()
{
	return new VehicleController();
}

@Bean
public Car getCar1()
{
	return new Car();
}


@Bean({"car2"})
public Car getCar2()
{
	System.out.println("car2");
	return new Car();
}
}
