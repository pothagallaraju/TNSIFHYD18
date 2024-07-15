package com.day1;

import java.util.Scanner;


public class program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        @SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String str = scanner.nextLine();
		        String reversedStr = new StringBuilder(str).reverse().toString();

		        if (str.equals(reversedStr)) {
		            System.out.println(str + " is a palindrome.");
		        } else {
		            System.out.println(str + " is not a palindrome.");
		        }
		    }
		}

		
