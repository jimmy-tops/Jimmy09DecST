package com.prcatice;

public class ZeroOnePattern {

	public static void main(String[] args) {
		
		int j,k;
		for (j=1;j<=5;j++)
		{
			for(k=1;k<=j;k++) {
				if((j+k)%2==0)
					System.out.print("1");
				else
					System.out.print("0");
	
					
			}
			System.out.println();
			
		}
	}
}
