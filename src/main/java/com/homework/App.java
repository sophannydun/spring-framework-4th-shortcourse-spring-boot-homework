package com.homework;

import org.springframework.beans.factory.parsing.BeanComponentDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.homework.configuration.BeanConfiguration;
import com.homework.model.Motor;
import com.homework.model.service.TravelService;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		TravelService travel = (TravelService) ctx.getBean("travelServicebyBicycle");
		travel.go();
		travel = (TravelService) ctx.getBean("travelServicebyMotor");
		travel.go();
		travel = (TravelService) ctx.getBean("travelServicebyCar");
		travel.go();
	}
}
