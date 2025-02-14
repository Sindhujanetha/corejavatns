package com.tnsif.multithreading;

class Notepad  implements Runnable{
	
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println("Notepad"+Thread.currentThread().getId());
		
	}
	
}

class Flipkart implements Runnable{
	public void run() {
		System.out.println("Flipkart"+Thread.currentThread().getId());
	}
}

public class Mainsleep {
	public static void main(String[] args) {
		Notepad n=new Notepad();
		Thread obj=new Thread(n);
		obj.start();
		obj.setPriority(Thread.MAX_PRIORITY);
		
		Flipkart f=new Flipkart();
		Thread obj1=new Thread(f);
		obj1.start();
		obj1.setPriority(Thread.MIN_PRIORITY);
		
		
		for(int i=0;i<5;i++)
		System.out.println("mainmethod "+ Thread.currentThread().getId()); 
		

	}

}
