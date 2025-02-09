package com.tnsif.airfares;

public class Main {

	public static void main(String[] args) {
		 AirIndia airIndiaFlight = new AirIndia("AI101", "New York", 500.0);
	        KingFisher kingFisherFlight = new KingFisher("KF202", "London", 600.0);

	        airIndiaFlight.displayDetails();
	        System.out.println("Fare: $" + airIndiaFlight.calculateFare());

	        kingFisherFlight.displayDetails();
	        System.out.println("Fare: $" + kingFisherFlight.calculateFare());
		
	}

}
