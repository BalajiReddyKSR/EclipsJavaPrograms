package com.JallaInfoTeck;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[]args) {
		int y;
		System.out.println("Enter the year");
		Scanner sc=new Scanner(System.in);
		y =sc.nextInt();
		if (y % 400 ==0){
			System.out.println(" Leap year");}
		else
		{
		System.out.println("Not Leap year");	
		}
		
	}

	}

