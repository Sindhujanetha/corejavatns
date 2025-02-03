package com.tnsif.polymorphism;

public class Car extends Vehicle {

	@Override
	void move() {
		System.out.println("car drivers");
	}
	void display() {
		super.move();
		move();
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.display();
			
	}
	

}
