package com.prcatice;

public class StarPattern {

	public static void main(String[] args) {

		int n = 3;
		
		for (int i = 1; i <= n; i++) {
			// Print spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			// Print asterisks
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("* ");
			}

			// Move to the next line
			System.out.println();
		}

		// Print lower part of the pattern
		for (int i = n - 1; i >= 1; i--) {
			// Print spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			// Print asterisks
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("* ");
			}

			// Move to the next line
			System.out.println();
		}
	}
}
