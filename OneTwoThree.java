package com.prcatice;

public class OneTwoThree {
	public static void main(String[] args) {

		int i, j,r;

		for (i = 1; i <= 4; i++) {
			
			for (r=4-i;r>=0;r--) {
				System.out.print(" ");
			}
				
			
			for (j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
