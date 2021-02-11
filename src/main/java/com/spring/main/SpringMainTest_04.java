package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.config.ApplicationConfiguration;
import com.service.VehicleService;

public class SpringMainTest_04 {

	public static void main(String[] args)
	{
		//Loading from class path
		//ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		VehicleService vehicleService = (VehicleService) context.getBean("vehicleService");
		vehicleService.show_details();
		
		vehicleService.show_sales_details();

	}
}
