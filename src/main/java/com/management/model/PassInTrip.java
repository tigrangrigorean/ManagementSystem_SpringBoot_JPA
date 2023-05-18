package com.management.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pass_in_trip")
public class PassInTrip {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "pass_in_trip_id")
private long id;
    @OneToOne(cascade = CascadeType.ALL)
    private Trip trip;
    @OneToOne(cascade = CascadeType.ALL)
    private Passenger passenger;
    @Column(name = "date")
    private String date;
    @Column(name = "place")
    private String place;

    /**
     * Default constructor
     */
    public PassInTrip() {

    }

    /**
     * @param date
     * @param place
     */
    public PassInTrip(Trip trip, Passenger passenger, String date, String place) {
        this.trip = trip;
        this.passenger = passenger;
        this.date = date;
        this.place = place;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the tripId
     */
    public Trip getTrip() {
        return trip;
    }

    /**
     * @param
     */
    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    /**
     * @return the passengerId
     */
    public Passenger getPassengerId() {
        return passenger;
    }

    /**
     *
     */
    public void setPassengerId(Passenger passenger) {
        this.passenger = passenger;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the place
     */
    public String getPlace() {
        return place;
    }

    /**
     * @param place the place to set
     */
    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "PassInTrip [tripId=" + trip + ", passengerId=" + passenger + ", date=" + date + ", place=" + place
                + "]";
    }
}
