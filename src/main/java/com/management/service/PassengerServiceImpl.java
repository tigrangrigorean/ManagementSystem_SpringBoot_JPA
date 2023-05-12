package com.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.model.Passenger;
import com.management.repository.PassengerRepository;
import com.management.validation.Validator;

@Service
public class PassengerServiceImpl implements PassengerService{
	
	private final PassengerRepository passengerRepository;
	
	@Autowired
	public PassengerServiceImpl(PassengerRepository passengerRepository) {
		this.passengerRepository = passengerRepository;
	}

	@Override
	public Passenger getById(long id) {
		Validator.checkId(id);
		Validator.checkEntity(passengerRepository.getPassengerById(id));
		return passengerRepository.getPassengerById(id);
	}

	@Override
	public List<Passenger> getAll() {
		Validator.checkList(passengerRepository.findAll());
		return passengerRepository.findAll();
	}

	@Override
	public List<Passenger> get(int offset, int perPage, String sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger save(Passenger passenger) {
		return passengerRepository.save(passenger);
	}

	@Override
	public Passenger update(long id, Passenger passenger) {
		Passenger updatePassenger = passengerRepository.getPassengerById(id);
		Validator.checkEntity(updatePassenger);
		Validator.checkEntity(passenger);
		passenger.setId(id);
		return passengerRepository.save(passenger);
	}

	@Override
	public void delete(long passengerId) {
		Passenger passenger = passengerRepository.getPassengerById(passengerId);
		Validator.checkEntity(passenger);
		passengerRepository.delete(passenger);
	}
	
	
	

}
