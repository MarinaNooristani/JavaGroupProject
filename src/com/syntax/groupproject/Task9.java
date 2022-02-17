package com.syntax.groupproject;

public class Task9 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?

		int[] numbers = { 100, 1000, 800, 67, 9, 1 };
		int largest = 0;
		int secondLargest = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				secondLargest = largest;
				largest = numbers[i];
			} else if (numbers[i] > secondLargest) {
				secondLargest = numbers[i];
			}
		}

		System.out.println("The second largest number in the array = " + secondLargest);

	}

}
