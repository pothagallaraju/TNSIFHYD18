package com.day1;

import java.util.Scanner;

public class program19 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
						        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the number of elements in the array: ");
		        int n = scanner.nextInt();

		        if (n <= 0) {
		            System.out.println("Number of elements must be greater than zero.");
		            return; // Exit the program if input is invalid
		        }

		        int[] array = new int[n];

		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < n; i++) {
		            array[i] = scanner.nextInt();
		        }

		        // Initialize variables to store max and min values
		        int max = array[0];
		        int min = array[0];

		        // Iterate through the array to find max and min in a single pass
		        for (int i = 1; i < n; i++) {
		            if (array[i] > max) {
		                max = array[i];
		            } else if (array[i] < min) {
		                min = array[i];
		            }
		        }

		        // Print the maximum and minimum elements
		        System.out.println("Maximum element in the array: " + max);
		        System.out.println("Minimum element in the array: " + min);

		        // Close the scanner
		        scanner.close();
		    }
		}

		
		
