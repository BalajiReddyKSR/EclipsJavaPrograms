package com.balaji;

import java.util.Scanner;

public class LeapYearr {

	public static void main (String []args) {
		int year;
		System.out.println("Enter The Year :  ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		if (year % 400 == 0) {
			System.out.println("The given year is a Leap Year");
		}
		else if (year % 4 == 0 && year % 100!=0 ) {
			System.out.println("The given year is a Leap Year");
			
		}else {
			
			System.out.println("The given year is a Leap Year");
		}
		
	}
}
