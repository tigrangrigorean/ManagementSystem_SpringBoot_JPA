package com.management.service;

<<<<<<< HEAD
import java.util.List;
=======
import java.util.Set;
>>>>>>> e7c19ed (Add Project Architecture)

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.model.Passenger;
import com.management.repository.PassengerRepository;
<<<<<<< HEAD
import com.management.validation.Validator;
=======
>>>>>>> e7c19ed (Add Project Architecture)

@Service
public class PassengerServiceImpl implements PassengerService{
	
<<<<<<< HEAD
	private final PassengerRepository passengerRepository;
	
	@Autowired
	public PassengerServiceImpl(PassengerRepository passengerRepository) {
		this.passengerRepository = passengerRepository;
	}

	@Override
	public Passenger getById(long id) {
		Validator.checkId(id);
		Validator.checkEntity(passengerRepository.getPassengerById(id));
=======
	@Autowired
	private PassengerRepository passengerRepository;

	@Override
	public Passenger getById(long id) {
>>>>>>> e7c19ed (Add Project Architecture)
		return passengerRepository.getPassengerById(id);
	}

	@Override
<<<<<<< HEAD
	public List<Passenger> getAll() {
		Validator.checkList(passengerRepository.findAll());
		return passengerRepository.findAll();
	}

	@Override
	public List<Passenger> get(int offset, int perPage, String sort) {
=======
	public Set<Passenger> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Passenger> get(int offset, int perPage, String sort) {
>>>>>>> e7c19ed (Add Project Architecture)
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger save(Passenger passenger) {
<<<<<<< HEAD
		return passengerRepository.save(passenger);
	}

	@Override
	public Passenger update(long id, Passenger passenger) {
		Passenger updatePassenger = passengerRepository.getPassengerById(id);
		Validator.checkEntity(updatePassenger);
		Validator.checkEntity(passenger);
		passenger.setId(id);
		return passengerRepository.save(passenger);
=======
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger update(Passenger passenger) {
		// TODO Auto-generated method stub
		return null;
>>>>>>> e7c19ed (Add Project Architecture)
	}

	@Override
	public void delete(long passengerId) {
<<<<<<< HEAD
		Passenger passenger = passengerRepository.getPassengerById(passengerId);
		Validator.checkEntity(passenger);
		passengerRepository.delete(passenger);
=======
		// TODO Auto-generated method stub
		
>>>>>>> e7c19ed (Add Project Architecture)
	}
	
	
	

}
