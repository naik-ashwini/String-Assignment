package com.prowings.assignments.string;

import java.util.Scanner;

public class ReplaceCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String input = sc.nextLine();	
		
		System.out.println("Enter a character to be replaced : "+sc.nextLine());
		char oldChar = sc.next().charAt(0);
		
		System.out.println("Enter a character to replace with : "+sc.nextLine());
		char newChar = sc.next().charAt(0);
		
		String result = replaceCharacter(input, oldChar, newChar);
		System.out.println("String after replacing character : "+result);
		
	}
	public static String replaceCharacter(String input, char oldChar, char newChar)
	{
		return input.replace(oldChar, newChar);
	}
}
