package com.day1;

import java.util.Scanner;

public class program6 {
		    public static void main(String[] args) {
		        @SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String str = scanner.nextLine();
		        StringBuilder reversedStr = new StringBuilder();

		        for (int i = str.length() - 1; i >= 0; i--) {
		            reversedStr.append(str.charAt(i));
		        }

		        System.out.println("Reversed string: " + reversedStr.toString());
		    }
		}

		
		
