package com.syntax.groupproject;

public class Task7 {

	public static void main(String[] args) {
		// 7.Write a Java Program to print the first 10 numbers of Fibonacci series.

		int num1 = 1;
		int num2 = 2;
		System.out.println(num1);
		System.out.println(num2);
		int num3;

		for (int i = 0; i < 8; i++) {
			num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}

	}

}
