package com.tnsif.exceptionhandling;
import com.tnsif.scannerdemo.Mainmethod;

public class Throwdemo {
	public void validate(int age) {
		try {
			
		if(age<18) {
			throw new ArithmeticException("you are not eligiable");
		}
		else {
			System.out.println("you are eligiable");
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
	public static void main(String[] args) {
		
		Throwdemo d=new Throwdemo();
		
		d.validate(40);
		System.out.println("hello");
	}

	

}
