package com.tnsif.airfares;

public class KingFisher implements Airfare{
	 private String flightNumber;
	    private String destination;
	    private double baseFare;

	    public KingFisher() {
	    }
	    public KingFisher(String flightNumber, String destination, double baseFare) {
	        this.flightNumber = flightNumber;
	        this.destination = destination;
	        this.baseFare = baseFare;
	    }
		public String getFlightNumber() {
			return flightNumber;
		}
		public void setFlightNumber(String flightNumber) {
			this.flightNumber = flightNumber;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public double getBaseFare() {
			return baseFare;
		}
		public void setBaseFare(double baseFare) {
			this.baseFare = baseFare;
		}
		@Override
		public void displayDetails() {
			 System.out.println("KingFisher Flight " + flightNumber + " to " + destination);
			
		}
		@Override
		public double calculateFare() {
			return baseFare*1.05;
		}    
}
