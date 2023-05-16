package com.management.service;

import com.management.model.Trip;

import java.util.List;

public interface TripService {
    Trip getById(long id);
    List<Trip> getAll();
    List<Trip> get(int offset, int perPage, String sort);
    Trip save(Trip passenger);
    Trip update(long id, Trip trip);
    void delete(long tripId);
    List<Trip> getTripsFrom(String townFrom);
    List<Trip> getTripsTo(String townTo);










}
