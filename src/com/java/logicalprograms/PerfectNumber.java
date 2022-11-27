package com.java.logicalprograms;
/**
 * imports the Scanner class of the java.util package
 */
import java.util.Scanner;

public class PerfectNumber 
{
	/**
	 * program execution starts from main method
	 * @param args
	 */

	public static void main(String[] args) 
	{
		/*
		 * Taking user input using Scanner object
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		/*
		 * declaring variable
		 */
		int number = input.nextInt();
		int sum =0;
		/*
		 * Logic for checking perfect number
		 */
		for(int i=1;i<number;i++)
		{	
			if(number%i==0)
				sum=sum+i;
		}
	
		if(sum==number)
			System.out.println(" is a perfect number");
		else
			System.out.println(" is not a perfect number");
	}

}
