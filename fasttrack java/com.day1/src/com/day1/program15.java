package com.day1;

import java.util.Scanner;

public class program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			        // Create a Scanner object to read input from the user
		        Scanner scanner = new Scanner(System.in);

		        // Prompt the user to enter a number
		        System.out.print("Enter a number: ");
		        int n = scanner.nextInt();

		        // Calculate the sum of natural numbers up to n
		        int sum = 0;
		        for (int i = 1; i <= n; i++) {
		            sum += i;
		        }

		        // Print the sum
		        System.out.println("Sum of natural numbers up to " + n + " is: " + sum);

		        // Close the scanner to release resources
		        scanner.close();
		    }
		}
