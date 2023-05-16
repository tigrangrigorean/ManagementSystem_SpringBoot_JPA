package com.management.repository;

import com.management.model.PassInTrip;
import com.management.model.Passenger;
import com.management.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PassInTripRepository  extends JpaRepository<PassInTrip,Long> {
    public void deletePassInTripByPassenger(Passenger passenger);

    public List<Passenger> findPassengerByTrip(Trip trip);
}
