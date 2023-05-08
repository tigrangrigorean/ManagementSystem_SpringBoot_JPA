package com.management.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.model.Passenger;
import com.management.repository.PassengerRepository;

@Service
public class PassengerServiceImpl implements PassengerService{
	
	@Autowired
	private PassengerRepository passengerRepository;

	@Override
	public Passenger getById(long id) {
		return passengerRepository.getPassengerById(id);
	}

	@Override
	public Set<Passenger> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Passenger> get(int offset, int perPage, String sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger save(Passenger passenger) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger update(Passenger passenger) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long passengerId) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
