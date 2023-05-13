package com.management.service;

import com.management.model.Trip;
import com.management.repository.TripRepository;
import com.management.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripServiceImpl implements TripService{

    private final TripRepository tripRepository;

    @Autowired
    public TripServiceImpl(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    @Override
    public Trip getById(long id) {
        Validator.checkId(id);
        Validator.checkEntity(tripRepository.getTripById(id));
        return tripRepository.getTripById(id);
    }

    @Override
    public List<Trip> getAll() {
        Validator.checkList(tripRepository.findAll());
        return tripRepository.findAll();
    }

    @Override
    public List<Trip> get(int offset, int perPage, String sort) {
        return null;
    }

    @Override
    public Trip save(Trip trip) {
        return tripRepository.save(trip);
    }

    @Override
    public Trip update(long id, Trip trip) {
        Trip updateTrip = tripRepository.getTripById(id);
        Validator.checkEntity(updateTrip);
        Validator.checkEntity(trip);
        trip.setTripId(id);
        return tripRepository.save(trip);
    }

    @Override
    public void delete(long tripId) {
            Trip trip = tripRepository.getTripById(tripId);
            Validator.checkEntity(trip);
            tripRepository.delete(trip);
    }

    @Override
    public List<Trip> getTripsFrom(String city) {
        return null;
    }

    @Override
    public List<Trip> getTripsTo(String city) {
        return null;
    }
}
