package com.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.management.model.Passenger;
import com.management.service.PassengerServiceImpl;

@Controller
@RequestMapping("/passengers")
public class PassengerController {
	
	

	private final PassengerServiceImpl passengerServiceImpl;

	@Autowired
	public PassengerController(PassengerServiceImpl passengerServiceImpl) {
		this.passengerServiceImpl = passengerServiceImpl;
	}
	
	
	@GetMapping("/{id}")
	@ResponseBody
	public String getPassengerById(@PathVariable(value = "id") long id) {
		return passengerServiceImpl.getById(id).toString();
	}
	
	@GetMapping
	@ResponseBody
	public String getPassengerList() {
		return passengerServiceImpl.getAll().toString();
	}
	
	@PostMapping("/save")
	public String createPassenger(@RequestBody Passenger passenger) {
		return passengerServiceImpl.save(passenger).toString();
	}
	
	@PutMapping("/{id}")
	public String updatePassenger(@PathVariable(value = "id") long id, @RequestBody Passenger passenger) {
		return passengerServiceImpl.update(id, passenger).toString();
	}
	
	
	@DeleteMapping("/remove")
	public String deletePassenger(@RequestParam(value = "id") long id) {
		passengerServiceImpl.delete(id);
		return "Passenger by ID " + id + " deleted";
	}

	@GetMapping("/bytripid/{trip}")
	public String findPassengerByTrip(@PathVariable(value = "trip") long tripNumber){
		return passengerServiceImpl.getPassengersOfTrip(tripNumber).toString();
	}

}
