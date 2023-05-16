package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.model.Passenger;

import java.util.List;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long>{

	Passenger getPassengerById(long id);


}
