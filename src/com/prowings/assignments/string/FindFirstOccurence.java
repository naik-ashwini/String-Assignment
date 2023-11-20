package com.prowings.assignments.string;

import java.util.Scanner;

public class FindFirstOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String input = sc.nextLine();
		
		System.out.println("Enter a Substring : ");
		String subString = sc.nextLine();
		
		int index = findSubstring(input, subString);
		if(index != -1)
			System.out.println("SubString found at index : "+index);
		else
			System.out.println("SubString is not found");
			
	}

	private static int findSubstring(String input, String subString) {
		return input.indexOf(subString);
	}
}
