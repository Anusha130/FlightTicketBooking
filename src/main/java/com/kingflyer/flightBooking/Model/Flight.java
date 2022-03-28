package com.kingflyer.flightBooking.Model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "Flight")
public class Flight implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String departureLocation;
	private String arrivalLocation;

	public String getDepartureLocation() {
		return departureLocation;
	}

	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	public String getArrivalLocation() {
		return arrivalLocation;
	}

	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}

	private int fleetId;
	private int remainingEconomySeats;
	private int remainingBusinessSeats;
	private int remainingPremiumSeats;
	private LocalDate departureTime;
	private LocalDate arrivalTime;
	private LocalDate travelDate;
	private int fareId;

	
	public int getid() {
		return id;
	}

	public int getFleetId() {
		return fleetId;
	}

	public void setFleetId(int fleetId) {
		this.fleetId = fleetId;
	}

	public int getRemainingEconomySeats() {
		return remainingEconomySeats;
	}

	public void setRemainingEconomySeats(int remainingEconomySeats) {
		this.remainingEconomySeats = remainingEconomySeats;
	}

	public int getRemainingBusinessSeats() {
		return remainingBusinessSeats;
	}

	public int getRemainingPremiumSeats() {
		return remainingPremiumSeats;
	}

	public LocalDate getDepartureTime() {
		return departureTime;
	}

	public LocalDate getArrivalTime() {
		return arrivalTime;
	}

	public LocalDate getTravelDate() {
		return travelDate;
	}

	public int getFareId() {
		return fareId;
	}

	public void setid(int id) {
		this.id = id;
	}

	public void setRemainingBusinessSeats(int remainingBusinessSeats) {
		this.remainingBusinessSeats = remainingBusinessSeats;
	}

	public void setRemainingPremiumSeats(int remainingPremiumSeats) {
		this.remainingPremiumSeats = remainingPremiumSeats;
	}

	public void setDepartureTime(LocalDate departureTime) {
		this.departureTime = departureTime;
	}

	public void setArrivalTime(LocalDate arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}

	public void setFareId(int fareId) {
		this.fareId = fareId;
	}

	

	@Override
	public String toString() {
		return "Flight [id=" + id + ", arrivalLocation=" + arrivalLocation + ", remainingEconomySeats="
				+ remainingEconomySeats + "]";
	}

	public Flight(int id, String  arrivalLocation,int remainingEconomySeats) {
		super();
		this.id = id;
		this.arrivalLocation = arrivalLocation;
		this.remainingEconomySeats = remainingEconomySeats;
	}

	public Flight() {
		super();
	}

}