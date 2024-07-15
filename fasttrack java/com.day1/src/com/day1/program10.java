package com.day1;

import java.util.Scanner;

public class program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 	            @SuppressWarnings("resource")
					Scanner scanner = new Scanner(System.in);
	            System.out.print("Enter a number: ");
	            int num = scanner.nextInt();
	            int sum = 0;

	            while (num != 0) {
	                sum += num % 10;
	                num /= 10;
	            }

	            System.out.println("Sum of digits: " + sum);
	        }
	    }
