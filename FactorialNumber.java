package com.prcatice;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = sc.nextInt();

		for (int i = a; i > 0; i--) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
