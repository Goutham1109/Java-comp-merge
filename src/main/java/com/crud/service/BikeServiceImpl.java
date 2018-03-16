package com.crud.service;

import java.util.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.crud.entity.Bike;
import com.crud.repository.BikeRepository;

@Service
public class BikeServiceImpl implements BikeService {

	@Autowired
	private BikeRepository bikeRepository;

	@Override
	@CrossOrigin
	public List<Bike> getAllBikes() {
		List<Bike> bikes = new ArrayList<Bike>();
		Iterator<Bike> iterator = bikeRepository.findAll().iterator();
		while (iterator.hasNext()) {
			bikes.add(iterator.next());
		}

		return bikes;
	}

	@Override
	@CrossOrigin
	public Bike getBike(Integer bikeId) {
		return bikeRepository.findOne(bikeId);
	}

	@Override
	@CrossOrigin
	public Bike createBike(Bike bike) {
		return bikeRepository.save(bike);
	}

	@Override
	@CrossOrigin
	public Bike updateBike(Bike bike) {
		return bikeRepository.save(bike);
	}

	@Override
	@CrossOrigin
	public void deleteBike(Integer bikeId) {
		bikeRepository.delete(bikeId);

	}

}
