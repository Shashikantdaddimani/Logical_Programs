package com.java.logicalprograms;
/**
 * imports all the class of the java.util package
 */
import java.util.Scanner;

public class FibonacciSeries
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
		System.out.println("enter the numbers");
		int number = input.nextInt();
		/*
		 * Declaring the variables
		 */
		int firstTerm=0;
		int secondTerm=1;
		System.out.println("Fibonacci series "+number+" term");
		/*
		 * Logic for checking Fibonacci series
		 */
		for(int i=1;i<=number;i++)
		{
			System.out.print(firstTerm+" ");
			int nextTerm=firstTerm + secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
	}
	

}
