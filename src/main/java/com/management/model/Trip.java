package com.management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "trip")
public class Trip {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "trip_id")
	private long tripId;
	@Column(name = "trip_number")
	private long tripNumber;
	@ManyToOne
	private Company company;
	@Column(name = "town_from")
	private String townFrom;
	@Column(name = "town_to")
	private String townTo;
	@Column(name = "time_out")
	private String timeOut;
	@Column(name = "time_in")
	private String timeIn;
	
	/**
	 * Default Constructor
	 */
	public Trip() {
		
	}

	/**
	 * @param tripNumber
	 * @param company
	 * @param townFrom
	 * @param townTo
	 * @param timeOut
	 * @param timeIn
	 */
	public Trip(long tripNumber, Company company, String townFrom, String townTo, String timeOut, String timeIn) {
		super();
		this.tripNumber = tripNumber;
		this.company = company;
		this.townFrom = townFrom;
		this.townTo = townTo;
		this.timeOut = timeOut;
		this.timeIn = timeIn;
	}

	/**
	 * @return the tripId
	 */
	public long getTripId() {
		return tripId;
	}

	/**
	 * @param tripId the tripId to set
	 */
	public void setTripId(long tripId) {
		this.tripId = tripId;
	}

	/**
	 * @return the tripNumber
	 */
	public long getTripNumber() {
		return tripNumber;
	}

	/**
	 * @param tripNumber the tripNumber to set
	 */
	public void setTripNumber(long tripNumber) {
		this.tripNumber = tripNumber;
	}

	/**
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * @return the townFrom
	 */
	public String getTownFrom() {
		return townFrom;
	}

	/**
	 * @param townFrom the townFrom to set
	 */
	public void setTownFrom(String townFrom) {
		this.townFrom = townFrom;
	}

	/**
	 * @return the townTo
	 */
	public String getTownTo() {
		return townTo;
	}

	/**
	 * @param townTo the townTo to set
	 */
	public void setTownTo(String townTo) {
		this.townTo = townTo;
	}

	/**
	 * @return the timeOut
	 */
	public String getTimeOut() {
		return timeOut;
	}

	/**
	 * @param timeOut the timeOut to set
	 */
	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}

	/**
	 * @return the timeIn
	 */
	public String getTimeIn() {
		return timeIn;
	}

	/**
	 * @param timeIn the timeIn to set
	 */
	public void setTimeIn(String timeIn) {
		this.timeIn = timeIn;
	}

	@Override
	public String toString() {
		return "Trip [tripNumber=" + tripNumber + ", company=" + company + ", townFrom=" + townFrom + ", townTo="
				+ townTo + ", timeOut=" + timeOut + ", timeIn=" + timeIn + "]";
	}

}
