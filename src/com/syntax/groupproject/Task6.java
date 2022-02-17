package com.syntax.groupproject;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// 6.Write a java program to check whether a given number is prime or not?

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scan.nextInt();
		int count = 0;
		for (int i = 1; i <= number; i++) {

			if (number % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
		scan.close();

	}

}
