package com.syntax.groupproject;

public class Task8 {

	public static void main(String[] args) {
		// 8.Maximum and minimum number in the array?

		int[] numbers = { 12, 400, 978, 1, 9, 63 };

		int max = numbers[0];// assume
		int min = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("Maximum number in the array = " + max);
		System.out.println("Minimum number in the array = " + min);
	}

}
