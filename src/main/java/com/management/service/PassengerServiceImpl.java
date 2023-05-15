package com.management.service;

<<<<<<< HEAD
<<<<<<< HEAD
import java.util.List;
=======
import java.util.Set;
>>>>>>> e7c19ed (Add Project Architecture)
=======
import java.util.List;
>>>>>>> origin/Lilia_Branch

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.model.Passenger;
import com.management.repository.PassengerRepository;
<<<<<<< HEAD
<<<<<<< HEAD
import com.management.validation.Validator;
=======
>>>>>>> e7c19ed (Add Project Architecture)
=======
import com.management.validation.Validator;
>>>>>>> origin/Lilia_Branch

@Service
public class PassengerServiceImpl implements PassengerService{
	
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> origin/Lilia_Branch
	private final PassengerRepository passengerRepository;
	
	@Autowired
	public PassengerServiceImpl(PassengerRepository passengerRepository) {
		this.passengerRepository = passengerRepository;
	}

	@Override
	public Passenger getById(long id) {
		Validator.checkId(id);
		Validator.checkEntity(passengerRepository.getPassengerById(id));
<<<<<<< HEAD
=======
	@Autowired
	private PassengerRepository passengerRepository;

	@Override
	public Passenger getById(long id) {
>>>>>>> e7c19ed (Add Project Architecture)
=======
>>>>>>> origin/Lilia_Branch
		return passengerRepository.getPassengerById(id);
	}

	@Override
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> origin/Lilia_Branch
	public List<Passenger> getAll() {
		Validator.checkList(passengerRepository.findAll());
		return passengerRepository.findAll();
	}

	@Override
	public List<Passenger> get(int offset, int perPage, String sort) {
<<<<<<< HEAD
=======
	public Set<Passenger> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Passenger> get(int offset, int perPage, String sort) {
>>>>>>> e7c19ed (Add Project Architecture)
=======
>>>>>>> origin/Lilia_Branch
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger save(Passenger passenger) {
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> origin/Lilia_Branch
		return passengerRepository.save(passenger);
	}

	@Override
	public Passenger update(long id, Passenger passenger) {
		Passenger updatePassenger = passengerRepository.getPassengerById(id);
		Validator.checkEntity(updatePassenger);
		Validator.checkEntity(passenger);
		passenger.setId(id);
		return passengerRepository.save(passenger);
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger update(Passenger passenger) {
		// TODO Auto-generated method stub
		return null;
>>>>>>> e7c19ed (Add Project Architecture)
=======
>>>>>>> origin/Lilia_Branch
	}

	@Override
	public void delete(long passengerId) {
<<<<<<< HEAD
<<<<<<< HEAD
		Passenger passenger = passengerRepository.getPassengerById(passengerId);
		Validator.checkEntity(passenger);
		passengerRepository.delete(passenger);
=======
		// TODO Auto-generated method stub
		
>>>>>>> e7c19ed (Add Project Architecture)
=======
		Passenger passenger = passengerRepository.getPassengerById(passengerId);
		Validator.checkEntity(passenger);
		passengerRepository.delete(passenger);
>>>>>>> origin/Lilia_Branch
	}
	
	
	

}
