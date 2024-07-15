package com.day1;

import java.util.Scanner;


public class program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Prompt the user to enter a number
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();

		        // Reverse the number
		        int reversedNumber = 0;
		        while (number != 0) {
		            int digit = number % 10;
		            reversedNumber = reversedNumber * 10 + digit;
		            number /= 10;
		        }

		        // Print the reversed number
		        System.out.println("Reversed number: " + reversedNumber);

		        // Close the scanner
		        scanner.close();
		    }
		}


