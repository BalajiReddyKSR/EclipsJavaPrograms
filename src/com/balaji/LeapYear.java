package com.balaji;

import java.util.Scanner;

public class LeapYear {
	public static void main(String []args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year ");
		year = sc.nextInt();
		if (year % 400 == 0 ) {
			System.out.println("The given year is a Leap Year");
		}
		else {
			System.out.println("The given year is a not Leap Year");	
			
		}
		
	}

}
