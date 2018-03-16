package com.crud.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.crud.entity.Bike;

public interface BikeRepository extends CrudRepository<Bike, Serializable>{

}
