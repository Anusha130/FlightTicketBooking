package com.kingflyer.flightBooking.Service;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.kingflyer.flightBooking.Model.Flight;
import com.kingflyer.flightBooking.Repository.FlightRepo;

@Service
public class FlightService {

	@Autowired
	private FlightRepo repo;

	public Flight addFlightdetails(Flight e) {
		Flight f = repo.save(e);
		return f;
	}

	public Optional<Flight> findByFlightId(int id) {
		return repo.findById(id);
	}

	public Optional<Flight> findByArrivalLocation(String arrivalLocation) {
		return repo.findByArrivalLocation(arrivalLocation);
	}

	public Optional<Flight> findByRemainingEconomySeats(int remainingEconomySeats) {
		return repo.findByRemainingEconomySeats(remainingEconomySeats);
	}

	public void findByArrivalLocation() {
		
	}
	public void findByRemainingEconomySeats() {
		
	}
	public void findByFlightId() {
		
	}

	public void findByremainingEconomySeats() {

		
	}


	}
