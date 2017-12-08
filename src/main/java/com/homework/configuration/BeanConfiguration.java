package com.homework.configuration;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.cache.Cache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.homework.model.Bicycle;
import com.homework.model.Car;
import com.homework.model.Motor;
import com.homework.model.service.TravelService;



@Configuration
public class BeanConfiguration {

	@Bean
	public Bicycle bicycle(){
		return new Bicycle();
	}
	@Bean
	public Motor motor(){
		/*Motor motor=new Motor();
		return motor;*/
		return new Motor();
	}
	@Bean
	public Car car(){
		return new Car();
	}
	@Bean
	public TravelService travelServicebyBicycle(){
		TravelService travelService=new TravelService(bicycle());
		return travelService;
	}
	@Bean
	public TravelService travelServicebyMotor(){
		TravelService travelService=new TravelService(motor());
		return travelService;
	}
	@Bean
	public TravelService travelServicebyCar(){
		TravelService travelService=new TravelService(car());
		return travelService;
	}
}
