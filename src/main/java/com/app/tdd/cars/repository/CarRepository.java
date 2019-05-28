package com.app.tdd.cars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.tdd.cars.models.Car;

/**
 * The interface Car repository.
 *
 * @author A Sudhakar Rao
 */
public interface CarRepository extends JpaRepository<Car, Long> {
  
}
