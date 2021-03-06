package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Bike;
import com.crud.service.BikeService;


@RestController
@RequestMapping("/api/bikes")
public class BikeController {
	@Autowired
	private BikeService bikeService;
 
	@RequestMapping(value = "/allBikes", method = RequestMethod.GET)
	@CrossOrigin
	public List<Bike> getAllBikes() {
 
		return bikeService.getAllBikes();
	}
 
	@RequestMapping(value = "/getBike/{bikeId}", method = RequestMethod.GET)
	@CrossOrigin
	public Bike getBike(@PathVariable("bikeId") Integer bikeId) {
		return bikeService.getBike(bikeId);
	}
 
	@RequestMapping(value = "/createBike", method = RequestMethod.POST)
	@CrossOrigin
	public Bike createBike(@RequestBody Bike bike) {
		return bikeService.createBike(bike);
	}
 
	@RequestMapping(value = "/updateBike", method = RequestMethod.POST)
	@CrossOrigin
	public Bike updateBike(@RequestBody Bike bike) {
		return bikeService.updateBike(bike);
	}
	
	@RequestMapping(value = "/deleteBike/{bikeId}", method = RequestMethod.GET)
	@CrossOrigin
	public void deleteBike(@PathVariable("bikeId") Integer bikeId) {
		bikeService.deleteBike(bikeId);
	}
}
