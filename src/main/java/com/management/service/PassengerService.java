package com.management.service;

import java.util.Set;

import com.management.model.Passenger;

public interface PassengerService {
	
	   	Passenger getById(long id);
	    Set<Passenger> getAll();
	    Set<Passenger> get(int offset, int perPage, String sort);
	    Passenger save(Passenger passenger);
	    Passenger update(Passenger passenger);
	    void delete(long passengerId);
	   


}
