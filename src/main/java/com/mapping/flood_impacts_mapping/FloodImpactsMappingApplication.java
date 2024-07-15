package com.mapping.flood_impacts_mapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class FloodImpactsMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FloodImpactsMappingApplication.class, args);
	}

}
