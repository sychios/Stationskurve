package com.clearview.stationskurve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication()
@RestController
public class StationskurveApplication {

	public static void main(String[] args) {
		SpringApplication.run(StationskurveApplication.class, args);
	}


	@PostMapping("/greet")
	public String greet(){
		return "HTMX is working.";
	}
}
