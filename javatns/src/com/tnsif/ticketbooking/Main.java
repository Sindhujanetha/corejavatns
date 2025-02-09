package com.tnsif.ticketbooking;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name, Event, Payment Type (1-Cash, 2-Wallet, 3-Card), Amount: ");
        String[] details = scanner.nextLine().split(",");
        
        if (details.length < 4) {
            System.out.println("Invalid input");
            return;
        }
        
        String name = details[0].trim(), event = details[1].trim();
        int choice = Integer.parseInt(details[2].trim());
        double amount = Double.parseDouble(details[3].trim());
        TicketBooking booking = new TicketBooking(name, event);
        
        if (choice == 1) {
            booking.makePayment(amount);
        } else if (choice == 2 && details.length >= 5) {
            booking.makePayment(details[4].trim(), amount);
        } else if (choice == 3 && details.length >= 6) {
            booking.makePayment(Long.parseLong(details[5].trim()), details[4].trim(), amount);
        } else {
            System.out.println("Invalid choice");
        }

	}

}
