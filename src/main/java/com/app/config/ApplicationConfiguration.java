package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

import com.service.Two_Wheeler;
import com.service.VehicleService;

@Configuration
@ComponentScan("com.service.sales")
//@ComponentScan("com.*")
//@ComponentScan({"com.service","com.service.sales"})
//@ComponentScans({ComponentScan("asas")})
public class ApplicationConfiguration {

	@Bean("vehicleService")
	public VehicleService getVehicleService() {
		return new VehicleService("Suzuki");
	}
	
	@Bean("two-wheeler")
	public Two_Wheeler getTwoWheeler() {
		return new Two_Wheeler();
	}

}
