package com.ravina.vehicle.controller;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.ravina.vehicle.service.Vehicle;

@Component
@PropertySource(value = { "classpath:com/ravina/vehicle/config/application.properties" })
public class VehicleController {
	@Qualifier("car")
	// @Qualifier("${beanName}")

//	@Resource(name="${beanName}")
//	@Autowired
	@Inject
	private Vehicle vehicle;

	public String fetchModel() {
		return vehicle.model();
	}

}
