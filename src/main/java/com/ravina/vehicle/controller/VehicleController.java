package com.ravina.vehicle.controller;
import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import com.ravina.vehicle.service.Car;
import com.ravina.vehicle.service.Vehicle;

@Component
@PropertySource(value = { "classpath:com/ravina/vehicle/config/application.properties" })
public class VehicleController {
	@Qualifier("car2")

// @Qualifier("${beanName}")

//	@Resource(name="${beanName}")
//	@Autowired
//	@Inject
//	private Vehicle vehicle;
	
	@Autowired
	private Car c1,c2;
	
//	@Qualifier("car1")
//	
//	@Autowired
//	private Car c2;
	
	public String fetchModel() {
		
		System.out.println("c1"+c1.model());
		System.out.println("c2"+c2.model());


		return c1.model();
	}

}
