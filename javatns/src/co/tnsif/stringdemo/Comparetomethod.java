package co.tnsif.stringdemo;

public class Comparetomethod {
	public static void main(String[] args) {
		String s1="King";
		String s2="King";
		String s3="Queen";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));
	}

}
