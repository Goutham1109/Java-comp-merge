package com.crud.service;

import java.util.List;

import com.crud.entity.Bike;

public interface BikeService {

	List<Bike> getAllBikes();
	
	Bike getBike(Integer bikeId);
	
	Bike createBike(Bike bike);
	
	Bike updateBike(Bike bike);
 
	void deleteBike(Integer bikeId);
}
