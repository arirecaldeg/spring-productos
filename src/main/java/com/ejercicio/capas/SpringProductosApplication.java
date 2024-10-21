package com.ejercicio.capas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProductosApplication.class, args);
	}

}
