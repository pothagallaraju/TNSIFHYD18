package com.day1;


import java.util.Scanner;


public class program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			        @SuppressWarnings("resource")
					Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter first number: ");
		        int num1 = scanner.nextInt();
		        System.out.print("Enter second number: ");
		        int num2 = scanner.nextInt();

		        // Swapping using a temporary variable
		        int temp = num1;
		        num1 = num2;
		        num2 = temp;

		        System.out.println("After swapping: ");
		        System.out.println("First number: " + num1);
		        System.out.println("Second number: " + num2);
		    }
		}
		
		
		
		
		
