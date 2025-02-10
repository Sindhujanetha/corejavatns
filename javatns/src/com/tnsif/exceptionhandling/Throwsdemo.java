package com.tnsif.exceptionhandling;

import java.io.IOException;

public class Throwsdemo {
	void m1() {
		System.out.println("no exception");
	}
	void m2() throws IOException {
		System.out.println("Device error");
	}
	void m3() throws ArithmeticException, IndexOutOfBoundsException {
		System.out.println("file not found");}
	public static void main(String[] args) {
	
	Throwsdemo d=new Throwsdemo();
	
	d.m1();
	try {
		d.m2();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	try {
		d.m3();
	}
	catch(Exception t) {
		System.out.println(t.getMessage());
	}
		

	}

}
