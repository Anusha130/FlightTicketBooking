package com.kingflyer.flightBooking.Repository;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.kingflyer.flightBooking.Model.Flight;


@Repository
public interface FlightRepo extends CrudRepository<Flight, Integer> {
	
	public Optional<Flight> findByArrivalLocation(String arrivalLocation);
	
	public Optional<Flight> findByRemainingEconomySeats(int remainingEconomySeats);

	

	public Object findByFlightId(int flightId);




	
}
