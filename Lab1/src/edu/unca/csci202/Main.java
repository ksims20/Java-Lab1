package edu.unca.csci202;

import java.util.Scanner;


/**
 * 
 * @author Kamren Sims
 * Reads in a series of integers and prints their average. 
 */

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int x = 1;
		double y = 0.0;
		int z = 0;
		int[] Numbers = new int[10];
				
		
		
		while(x <= 10) {
			System.out.print("Enter integer " + x + ": ");
			
			String Ans = scan.nextLine();
			
			//converts user entered input to a parseInt, throws an exception if the user enters a non integer
			try {
				int IntAns = Integer.parseInt(Ans);
				Numbers[z] = IntAns;
				y += IntAns;
				z +=1;
			
				
			} catch (NumberFormatException e) {
				System.out.println("Invalid integer.");
				x--;
			}
			
			x++;
			
		}
		
		
		//Finds the average of the inputted numbers
		double average = y / z;
		
		
		//Prints out the numbers.
		System.out.print("The numbers are: ");
		for (int i = 0; i < 9;i++) {
			System.out.print(Numbers[i] + "," + " ");
		}
		System.out.print(Numbers[9]);
		
		//Prints out the average of those numbers
		
		System.out.println();
		System.out.println("The average is: " + average);
		
	}

}
