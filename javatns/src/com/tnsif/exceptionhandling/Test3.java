package com.tnsif.exceptionhandling;

public class Test3 {

	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}
		catch(ArrayIndexOutOfBoundsException f) {
			System.out.println(f.getMessage());
		}
		finally {
			System.out.println("hello java");
		}

	}

}
