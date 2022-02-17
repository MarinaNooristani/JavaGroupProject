package com.syntax.groupproject;

public class Task4 {

	public static void main(String[] args) {
		// 4.Create a 2D array of integers. Develop a program which will calculate the
		// sum of even and odd numbers for that array.

		int[][] numbers = { { 10, 9, 3, 8 }, { 4, 2 }, { 1, 3, 7 } };
		int sumEven = 0;
		int sumOdd = 0;
		for (int row = 0; row < numbers.length; row++) {
			for (int column = 0; column < numbers[row].length; column++) {
				if (numbers[row][column] % 2 == 0) {
					sumEven += numbers[row][column];
				} else {
					sumOdd += numbers[row][column];
				}
			}
		}
		System.out.println("Sum of all even numbers = " + sumEven);
		System.out.println("Sum of all odd numbers = " + sumOdd);

	}

}
