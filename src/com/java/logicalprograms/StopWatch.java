package com.java.logicalprograms;

/**
 * imports all the class of the java.util package
 */
import java.util.Scanner;

public class StopWatch 
{
	/**
	 * program execution starts from main method
	 * @param args
	 */
	public static void main(String[] args) 
	{	
		
		Scanner input = new Scanner(System.in);
		/*
		 * StopWatch Started at when entered 1
		 */
		System.out.println("Enter 1 to Start the Stopwatch");
		int watch=input.nextInt();
		/*
		 * currentTimeMillis() this method is return 
		 * current time in format of milliseconds
		 */
		long startMillis = System.currentTimeMillis();
		System.out.println("Stopwatch Started at :"+startMillis);
		/*
		 * StopWatch Stoped at when Entered 0
		 */
		System.out.println("Enter 0 to stop the Stopwatch");
		watch = input.nextInt();
		/*
		 * currentTimeMillis() this method is return 
		 * current time in format of milliseconds
		 */
		long stopMillis = System.currentTimeMillis();
		System.out.println("StopWatch Stoped at :"+stopMillis);
		/*
		 * Logic for Meassure the elapsed between Start and stop
		 */
		double elapsed = stopMillis-startMillis;
		/*
		 * logic for converting milliseconds to seconds
		 */
		double seconds =elapsed/1000;
		System.out.println("Time elapsed in seconds :"+seconds);

	}

}
