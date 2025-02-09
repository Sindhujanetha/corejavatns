package com.tnsif.details;

public class PersonalDetails {
	 private String fullName;
	    private int rollNumber;
	    private char grade;
	    private String percentage;

	    public PersonalDetails(String fullName, int rollNumber, char grade, String percentage) {
	        this.fullName = fullName;
	        this.rollNumber = rollNumber;
	        this.grade = grade;
	        this.percentage = percentage;
	    }

	    public void displayDetails() {
	        System.out.println(fullName);
	        System.out.println(rollNumber);
	        System.out.println(grade);
	        System.out.println(percentage);
	    }

	public static void main(String[] args) {
		 PersonalDetails details = new PersonalDetails("Ayan S", 5220365, 'A', "9.5%");
	        details.displayDetails();
		

	}

}
