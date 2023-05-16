package com.management.repository;

import com.management.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {
    Trip getTripByTripId(long id);

    public  List<Trip> getTripsByTownFrom(String townFrom);

    public List<Trip> getTripsByTownTo(String townTo);
    public Trip getTripByTripNumber(long tripNumber);
}
