package com.day1;

import java.util.Scanner;

public class program7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter first number: ");
		        int num1 = scanner.nextInt();
		        
		        System.out.print("Enter second number: ");
		        int num2 = scanner.nextInt();
		        
		        System.out.print("Enter third number: ");
		        int num3 = scanner.nextInt();
		        
		        scanner.close();

		        int largest = Math.max(num1, Math.max(num2, num3));

		        System.out.println("The largest number is " + largest);
		    }
		}

		
		
		
		
		

