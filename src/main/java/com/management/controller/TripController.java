package com.management.controller;

import com.management.model.Trip;
import com.management.service.TripServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/trip")
public class TripController {

    private final TripServiceImpl tripServiceImpl;

    @Autowired
    public TripController(TripServiceImpl tripServiceImpl) {
        this.tripServiceImpl = tripServiceImpl;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String getTripById(@PathVariable(value = "id") long id){
        return tripServiceImpl.getById(id).toString();
    }

    @GetMapping
    @ResponseBody
    public String getTripList(){
        return tripServiceImpl.getAll().toString();
    }

    @PostMapping("/save")
    public String createTrip(@RequestBody Trip trip){
        return tripServiceImpl.save(trip).toString();
    }

    @PutMapping("/{id}")
    public String updateTrip(@PathVariable(value = "id") long id, @RequestBody Trip trip){
        return tripServiceImpl.update(id,trip).toString();
    }

    @DeleteMapping("/remove")
    public String deleteTrip(@RequestParam(value = "id") long id){
        tripServiceImpl.delete(id);
        return "Trip by ID " + id + " deleted";
    }

}
