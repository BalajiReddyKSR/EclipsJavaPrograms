package com.balaji;

import java.util.Scanner;

public class CalculatorWithSwitchStatement {
	
	public static void main (String []args) {
		
		long a;
		long b;
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter The First Number : ");
	a = sc.nextLong();
	System.out.println("Enter the Operator( + , - , * ,/ ): ");
	char operator = sc.next().charAt(0);
	System.out.println("Enter The Second Number : ");
	b = sc.nextLong();
	switch (operator) {
	case '+' :
		System.out.println(a+b);
		break;
	case '-' :
		System.out.println(a-b);
		break;
	case '*' :
		System.out.println(a*b);
		break;
	case '/' :
		System.out.println(a/b);
		break;
	default : System.out.println("Invalid Input");

	}	
	} 
}
