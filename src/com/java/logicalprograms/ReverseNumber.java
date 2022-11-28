package com.java.logicalprograms;
/**
 * imports all the class of the java.util package
 */
import java.util.Scanner;

public class ReverseNumber 
{
	/**
	 * program execution starts from main method
	 * @param args
	 */
	public static void main(String[] args) 
	{
		/*
		 * Taking user input Using Scanner Object
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		/*
		 * Declaring the variables
		 */
		int number = input.nextInt();
		int reverse=0;
		int remainder;
		/*
		 * Logic for checking the reverse number
		 */
		for(int i=number;i>0;)
		{
			remainder=i%10;
			reverse= reverse*10+remainder;
			i=i/10;
		}
		System.out.println("The reverse number is "+reverse);
	}

}
