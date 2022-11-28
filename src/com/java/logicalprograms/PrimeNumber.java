package com.java.logicalprograms;
/**
 * imports the Scanner class of the java.util package
 */
import java.util.Scanner;

public class PrimeNumber 
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
		int number = input.nextInt();		
	    boolean flag = false;
	    for (int i = 2; i <= number-1; i++) 
	    {
	      /*
	       *  Condition for Non prime number
	       */
	      if (number % i == 0) 
	      {
	        flag = true;
	        break;
	      }
	    }
	    if (!flag)
	      System.out.println(number + " is a prime number.");
	    else
	      System.out.println(number + " is not a prime number.");
	}

}
