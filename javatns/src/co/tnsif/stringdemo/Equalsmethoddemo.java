package co.tnsif.stringdemo;

public class Equalsmethoddemo {

	public static void main(String[] args) {
		String s1="virat";
		String s2="virat";
		String s3=new String("virat");
		String s4="king";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));

	}

}
