package com.prcatice;

import java.util.Scanner;

public class PrimeOrNot {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ");
		int a =sc.nextInt();
		boolean flag=false;
		
		if (a<= 1) {
			System.out.println("Not Priime ");	
		    }
		else {
			for (int i=2; i<=a/2;i++)
			{
				if(a%i==0 )
				{
					flag =true;
					
				}
			}
			if (!flag)
			System.out.println("Prime number");
			else {
				System.out.println("not prime ");
			}
		}
	}

}
