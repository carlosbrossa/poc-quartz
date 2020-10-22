package com.carlitos.pocQuartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan
@EnableScheduling
public class PocQuartzApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocQuartzApplication.class, args);
	}

}
