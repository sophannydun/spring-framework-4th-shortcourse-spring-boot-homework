package com.homework.model.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.homework.model.IVehicle;

public class TravelService {
	private IVehicle vehicle;

	public IVehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(IVehicle vehicle) {
		this.vehicle = vehicle;
	}

	public TravelService(IVehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}

	public void go() {
		System.out.println("Go to travel by using " + vehicle.getType() + ".");
	}

	@Override
	public String toString() {
		return "TravelService [vehicle=" + vehicle + "]";
	}

}
