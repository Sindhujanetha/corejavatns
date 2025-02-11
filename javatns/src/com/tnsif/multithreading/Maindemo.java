package com.tnsif.multithreading;

class Msword extends Thread{
	public void run() {
		System.out.println("Msword"+Thread.currentThread().getId());
	}
}

class Chrome extends Thread{
	public void run() {
		System.out.println("Chrome"+Thread.currentThread().getId());
	}
}

class Eclipse extends Thread{
	public void run() {
		System.out.println("Eclipse"+Thread.currentThread().getId());
	}
}


public class Maindemo {

	public static void main(String[] args) {
		
		Msword m=new Msword();
		m.start();
		
		Chrome c=new Chrome();
		c.start();
		
		Eclipse e=new Eclipse();
		e.start();
		
		System.out.println("mainmethod "+Thread.currentThread().getId());

		
		

	}

}
