package com.kingflyer.flightBooking.Controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kingflyer.Exception.ResourceNotFoundException;
import com.kingflyer.flightBooking.Model.Flight;
import com.kingflyer.flightBooking.Service.FlightService;

@RestController
@RequestMapping("/Flight")

public class FlightController {

	@Autowired
	private FlightService service;

//Addingdetails

	@PostMapping("/addFlightdetails")
	public ResponseEntity<Flight> addFlight(@RequestBody Flight e) {
		System.out.println(e);
		Flight s = service.addFlightdetails(e);
		return new ResponseEntity<Flight>(s, HttpStatus.OK);
	}
//findbyflightByid

	@GetMapping("/findByflightId/{id}")
	public ResponseEntity<Optional<Flight>> FlightId(@PathVariable int id) {
		System.out.println(id);
		Optional<Flight> obj = service.findByFlightId(id);
		System.out.println(obj);
		if (obj.isPresent()) {
			service.findByFlightId();
		} else {
			throw new ResourceNotFoundException("Given id it's not available in db..");
		}
		return new ResponseEntity<Optional<Flight>>(obj, HttpStatus.OK);
	}

//findbyarrivalLocation

	@GetMapping("/findByarrivalLocation/{arrivalLocation}")
	public ResponseEntity<Optional<Flight>> arrivalLocation(@PathVariable String arrivalLocation) {
		System.out.println(arrivalLocation);
		Optional<Flight> obj = service.findByArrivalLocation(arrivalLocation);
		System.out.println(obj);
		if (obj.isPresent()) {
			service.findByArrivalLocation();
		} else {
			throw new ResourceNotFoundException("Given arrivallocation it's not available in db..");

		}
		return new ResponseEntity<Optional<Flight>>(obj, HttpStatus.OK);
	}

//findByremainingseats

	@GetMapping("/findByremainingEconomySeats/{remainingEconomySeats}")
	public ResponseEntity<Optional<Flight>> remainingEconomySeats(@PathVariable int remainingEconomySeats) {
		System.out.println(remainingEconomySeats);
		Optional<Flight> obj = service.findByRemainingEconomySeats(remainingEconomySeats);
		System.out.println(obj);
		if (obj.isPresent()) {
			service.findByRemainingEconomySeats();
		} else {
			throw new ResourceNotFoundException("Given EconomySeats it's not available in db..");

		}

		return new ResponseEntity<Optional<Flight>>(obj, HttpStatus.OK);
	}


}
