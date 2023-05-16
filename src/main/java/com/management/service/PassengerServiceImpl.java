package com.management.service;

import java.util.List;


import com.management.model.Trip;
import com.management.repository.PassInTripRepository;
import com.management.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.model.Passenger;
import com.management.repository.PassengerRepository;

import com.management.validation.Validator;


@Service
public class PassengerServiceImpl implements PassengerService{


	private final PassengerRepository passengerRepository;
	private final TripRepository tripRepository;
	private final PassInTripRepository passInTripRepository;


	@Autowired
	public PassengerServiceImpl(PassengerRepository passengerRepository, TripRepository tripRepository, PassInTripRepository passInTripRepository) {
		this.passengerRepository = passengerRepository;
		this.tripRepository = tripRepository;
		this.passInTripRepository = passInTripRepository;
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

	@Override
	public List<Passenger> getPassengersOfTrip(long tripNumber) {
		Validator.checkId(tripNumber);
		Trip trip = tripRepository.getTripByTripNumber(tripNumber);
		Validator.checkEntity(trip);
		return passInTripRepository.findPassengerByTrip(trip);
	}

	@Override
	public void registerTrip(Trip trip, Passenger passenger) {



	}

	@Override
	public void cancelTrip(long passengerId, long tripNumber) {
		Validator.checkId(passengerId);
		Validator.checkId(tripNumber);
		Passenger passenger = passengerRepository.getPassengerById(passengerId);
		Trip trip = tripRepository.getTripByTripNumber(tripNumber);
		Validator.checkEntity(trip);
		Validator.checkEntity(passenger);
		passInTripRepository.deletePassInTripByPassenger(passenger);
	}
}
