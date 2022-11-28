package com.java.logicalprograms;

/**
 * imports all the class of the java.util package
 */
import java.util.*;

public class CouponNumber 
{
	public static boolean isPresent(int number[], int randomNum) {
		for (int i = 0; i < number.length; i++) {
			if (number[i] == randomNum) {
				return true;
			}
		}
		return false;
	}

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
		System.out.println("how many random numbers do you need to generate a distinct coupon number?");
		/*
		 * declaring variable
		 */
		int size = input.nextInt();		
		int randomNum = 0;
		/*
		 * Actual array
		 */
		int number[] = new int[size];
		/*
		 * Taking Random Object by Generating the Random number
		 */
		Random coupon = new Random();
		boolean return1;
		/*
		 * logic for generating random coupon number
		 */

		for (int i = 0; i < number.length; i++) {
			randomNum = coupon.nextInt(20)+1;
			return1 = isPresent(number, randomNum);
			if (return1 != true) {
				number[i] = randomNum;
			} 
			else 
			{
				--i;
			}
		}	
		/*
		 * logic for printing generated coupon number
		 */
		System.out.println("The Coupon numbers generated are ");
		for (int i = 0; i < number.length; i++) {
			System.out.print(" " + number[i]);
		}

	}
}
