package com.ravina.vehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ravina.vehicle.controller.VehicleController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     
      ApplicationContext context = 
              new AnnotationConfigApplicationContext(VehicleApp.class);
      VehicleController vehicle=context.getBean(VehicleController.class);
      
   vehicle.fetchModel();
    }
}
