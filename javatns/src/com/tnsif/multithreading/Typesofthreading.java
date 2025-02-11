package com.tnsif.multithreading;

class Eclipse implements Runnable{
	public void run() {
		System.out.println("Eclipse"+Thread.currentThread().getId());
	}
}

class Amazon implements Runnable{
	public void run() {
		System.out.println("Amazon"+Thread.currentThread().getId());
	}
}
public class Typesofthreading {

	public static void main(String[] args) {
		Eclipse e=new Eclipse();
		Thread obj=new Thread(e);
		obj.start();
		
		Amazon a=new Amazon();
		Thread obj1=new Thread(a);
		obj1.start();
		
		System.out.println("Typesofthreading"+Thread.currentThread().getId());
		
	}

}
