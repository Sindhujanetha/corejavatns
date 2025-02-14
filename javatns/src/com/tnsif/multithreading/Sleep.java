package com.tnsif.multithreading;

class Demo extends Thread{
	public void run() {
		for (int i=0;i<5;i++) {
			
			System.out.println("Demo"+ Thread.currentThread().getId());
			try {
				sleep(2000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class Sleep {
	public static void main(String[] args) {
		Demo d=new Demo();
		d.start();
	}

}
