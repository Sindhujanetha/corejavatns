package com.tnsif.exceptionhandling;

public class Nestedtrycatch {
	public static void check() {
		String str="TNS";
		int slength =str.length();
		System.out.println("string length"+slength);
		
		String anootherstring=null;
		
		int y=6;
		try {
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException ex) {
				System.out.println("Index out of bound "+ex.getMessage());
			}
			System.out.println("string length"+anootherstring.length());
		}
		catch(NullPointerException e) {
			System.out.println("exception"+e.getMessage());
				
			}
		}
		
	}

