package com.balaji;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		System.out.println("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int count = 0;
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}
				if (count == 2) {
					System.out.println("The given number is a prime number");
				}
				else {
					System.out.println("The given number is not a prime number");
				}
			}
		else {
			System.out.println("The Number is not a prime number.");
		}

	}

}
