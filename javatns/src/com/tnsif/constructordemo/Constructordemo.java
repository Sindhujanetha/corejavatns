package com.tnsif.constructordemo;
import java.util.Scanner;

public class Constructordemo {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the customer name");
		
		String name=sc.next();
		
System.out.println("enter the customer id");
		
		int id=sc.nextInt();
		
System.out.println("enter the customer addresss");
		
		String adress=sc.next();
		
		Customer c=new Customer();
		
		c.setCustomername(name);
		c.setCustomerid(id);
		c.setCustomeradreess(adress);
		
		System.out.println(c);
		
		boolean output=c instanceof Customer;
		System.out.println(output);
	}


	

}
