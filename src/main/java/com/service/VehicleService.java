package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.service.sales.SalesService;

public class VehicleService {

	String name;
	public VehicleService(String name) {
		this.name = name;
	}
	
	
	Vehicle vehicle;	
	@Autowired
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	

	public void show_details() {
		System.out.println("Printing Details of  " + this.name);
		vehicle.start();
		vehicle.stop();
	}
	
	@Autowired
	SalesService salesService;
	
	public void show_sales_details() {
		System.out.println("Sales count: "+ salesService.no_of_sales());
	}
}
