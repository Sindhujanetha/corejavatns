package com.tnsif.ticketbooking;

public class TicketBooking {
	 private String customerName;
	    private String event;
	    private double amount;
	    
	    public TicketBooking(String customerName, String event) {
	        this.customerName = customerName;
	        this.event = event;
	    }
	    
	    public void makePayment(double amount) {
	        this.amount = amount;
	        System.out.printf("Payment successful: $%.1f\n", amount);
	        printReceipt();
	    }

	    public void makePayment(String wallet, double amount) {
	        this.amount = amount;
	        System.out.printf("Payment via %s Wallet: $%.1f\n", wallet, amount);
	        printReceipt();
	    }

	    public void makePayment(long cardNumber, String cardHolder, double amount) {
	        this.amount = amount;
	        System.out.printf("Payment via Credit Card (Card Holder: %s): $%.1f\n", cardHolder, amount);
	        printReceipt();
	    }

	    private void printReceipt() {
	        System.out.printf("\n--- Receipt ---\nCustomer Name: %s\nEvent: %s\nAmount Paid: $%.1f\n----------------\n", customerName, event, amount);
	    }
	}


	   