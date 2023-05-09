package com.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.management.service.PassengerServiceImpl;

@Controller
@RequestMapping("/passenger")
public class PassengerController {
	
	
	PassengerServiceImpl passengerServiceImpl;
	
	@Autowired
	public PassengerController(PassengerServiceImpl passengerServiceImpl) {
		this.passengerServiceImpl = passengerServiceImpl;
	}
	
	
	@GetMapping
	@ResponseBody
	public String getPassengerById(@RequestParam(value = "id") long id) {
		return "" + passengerServiceImpl.getById(id).toString();
	}

}
