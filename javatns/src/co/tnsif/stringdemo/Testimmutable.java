package co.tnsif.stringdemo;

public class Testimmutable {

	public static void main(String[] args) {
		String s="virat";
		s.concat("kohli");
		
		System.out.println(s);
		s=s.concat("kohli");
		System.out.println(s);

	}

}
