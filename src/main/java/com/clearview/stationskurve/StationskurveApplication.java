package com.clearview.stationskurve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class StationskurveApplication {

	public static void main(String[] args) {
		SpringApplication.run(StationskurveApplication.class, args);
	}

}
