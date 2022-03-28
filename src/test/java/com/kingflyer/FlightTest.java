package com.kingflyer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;

import com.kingflyer.flightBooking.Model.Flight;
import com.kingflyer.flightBooking.Repository.FlightRepo;
import com.kingflyer.flightBooking.Service.FlightService;

//@RunWith(SpringRunner.class)

@SpringBootTest
public class FlightTest {

	

	@MockBean
	private FlightRepo repository;

	@Autowired
	private FlightService service;

	@Test
	public void saveFlightTest() {

		Flight flight = new Flight(144, "karimnagar", 12);
		when(repository.save(flight)).thenReturn(flight);

		assertEquals(flight, service.addFlightdetails(flight));
	}
	
	  
	  public void testFindById() { 
		  int FlightId = 123; 
		  new Flight(144,"karimnagar",12);
	  when(repository.findByFlightId(FlightId)).thenReturn(Stream.of( new
	  Flight(123,"karimnagar",12)). collect(Collectors.toList()).size());
	  assertEquals(1, service.findByFlightId(FlightId));
	  
	  }
	 

}
