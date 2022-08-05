package org.globallogic.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("controller")
@ComponentScan("exception")
@ComponentScan("model")
@ComponentScan("repositories")
@ComponentScan("service")

public class FlightmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightmanagementApplication.class, args);
	}

}
