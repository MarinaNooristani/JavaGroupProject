package com.syntax.groupproject;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// 1.Create an array on integer values using a scanner and calculate the sum of
		// all stored elements in that array.
		Scanner input = new Scanner(System.in);

		int[] numbers = new int[4];
		int sum = 0;
		// we can take the input using loop
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter a number: ");
			numbers[i] = input.nextInt();
			sum += numbers[i];

		}

		System.out.println("The sum of all numbers=" + sum);
		input.close();

	}

}
