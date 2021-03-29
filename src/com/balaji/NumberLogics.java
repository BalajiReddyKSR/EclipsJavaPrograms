package com.balaji;

import java.util.Scanner;

public class NumberLogics {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("  * ");
			for (int j = 1; j <= i; j++) {
				System.out.print("  * ");
				for(int k=1; k<=j; k++) {
					System.out.print("  * ");
				}
			}
		}

	}
}