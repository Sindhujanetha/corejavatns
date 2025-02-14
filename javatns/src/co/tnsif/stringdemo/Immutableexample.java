package co.tnsif.stringdemo;

public class Immutableexample {

	public static void main(String[] args) {
		String s1="virat";
		String s2=s1;
		String s3=s2;
		
		System.out.println("before modification");
		System.out.println("s1"+s1);
		System.out.println("s2"+s2);
		System.out.println("s3"+s3);
		
		s1="kohli";
		
		System.out.println("after modification");
		System.out.println("s1"+s1);
		System.out.println("s2"+s2);
		System.out.println("s3"+s3);

	}

}
