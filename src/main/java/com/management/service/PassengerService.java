package com.management.service;

import java.util.List;
import java.util.Set;

import com.management.model.Passenger;

public interface PassengerService {
	
	   	Passenger getById(long id);
	    List<Passenger> getAll();
	    public List<Passenger> get(int offset, int perPage, String sort);
	    Passenger save(Passenger passenger);
	    Passenger update(long id,Passenger passenger);
	    void delete(long passengerId);

}
