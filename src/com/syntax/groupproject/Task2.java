package com.syntax.groupproject;

public class Task2 {

	public static void main(String[] args) {
		// 2.Create a 2D array of integer values. Print the sum of all numbers.

		int[][] numbers = { { 10, 20, 30, 40 }, { 100, 200, 300 }, { 1000, 2000 } };
		int sum = 0;
		for (int row = 0; row < numbers.length; row++) {
			for (int column = 0; column < numbers[row].length; column++) {
				sum += numbers[row][column];
			}
		}
		System.out.println(sum);

	}

}
