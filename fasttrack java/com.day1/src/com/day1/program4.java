package com.day1;

import java.util.Scanner;


public class program4 {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = scanner.nextInt();
		        boolean isPrime = true;

		        if (num <= 1) {
		            isPrime = false;
		        } else {
		            for (int i = 2; i <= Math.sqrt(num); i++) {
		                if (num % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		        }

		        if (isPrime) {
		            System.out.println(num + " is a prime number.");
		        } else {
		            System.out.println(num + " is not a prime number.");
		        }
		    }
		}
	
		
		
		
	