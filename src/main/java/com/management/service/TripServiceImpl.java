package com.management.service;

import com.management.model.Trip;
import com.management.repository.TripRepository;
import com.management.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        Validator.checkEntity(tripRepository.getTripByTripId(id));
        return tripRepository.getTripByTripId(id);
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
        Trip updateTrip = tripRepository.getTripByTripId(id);
        Validator.checkEntity(updateTrip);
        Validator.checkEntity(trip);
        trip.setTripId(id);
        return tripRepository.save(trip);
    }

    @Override
    public void delete(long tripId) {
            Trip trip = tripRepository.getTripByTripId(tripId);
            Validator.checkEntity(trip);
            tripRepository.delete(trip);
    }

    @Override
    public List<Trip> getTripsFrom(String townFrom) {
        Validator.checkList(tripRepository.getTripsByTownFrom(townFrom));
        return tripRepository.getTripsByTownFrom(townFrom);
    }

    @Override
    public List<Trip> getTripsTo(String townTo) {
        Validator.checkList(tripRepository.getTripsByTownTo(townTo));
        return tripRepository.getTripsByTownTo(townTo);
    }

}
