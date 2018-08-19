package com.jbk;

public class LeapYear_Demo {

		public static void main(String[] args) {
		int year=2020;
		if((year%400==0) || ((year%4==0) && (year%100 !=0)))
			System.out.println("Year" +year+ "is a leap year");
		else 
			System.out.println("Year" +year+ "is  NOT a leap year");

	}

}
