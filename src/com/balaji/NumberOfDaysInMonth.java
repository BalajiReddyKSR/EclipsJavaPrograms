package com.balaji;

import java.util.Scanner;

public class NumberOfDaysInMonth {
	public static void main(String[] args) {
		int m;
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month : ");
		m = sc.nextInt();
		System.out.println("Enter the Year : ");
		y = sc.nextInt();
		switch (m) {
		case 1:
			System.out.println("31 Days");
			break;
		case 3:
			System.out.println("31 Days");
			break;
		case 5:
			System.out.println("31 Days");
			break;
		case 7:
			System.out.println("31 Days");
			break;
		case 8:
			System.out.println("31 Days");
			break;
		case 10:
			System.out.println("31 Days");
			break;
		case 12:
			System.out.println("31 Days");
			break;
			
		case 4 :
			System.out.println("30 Days");
			break;
		case 6 :
			System.out.println("30 Days");
			break;
		case 9 :
			System.out.println("30 Days");
			break;
		case 11 :
			System.out.println("30 Days");
			break;
		case 2 :
		if ((y % 400 == 0 )||( y % 4 == 0 && y % 100!= 0)){
			
			System.out.println("29 Days");
		}
		else {
			System.out.println("28 Days");
			
		}
break;
			
default : System.out.println("Invalid Input");


		}
	}

}
