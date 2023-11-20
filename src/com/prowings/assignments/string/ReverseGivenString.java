package com.prowings.assignments.string;

public class ReverseGivenString {

	public static void main(String[] args) {

		String input = "WhatsApp";

		System.out.println("String before reverse : " + input);

		String reversedString = toReverseGivenString(input);
		System.out.println("String after reverse using array : " + reversedString);
		
		String reversedString1 = reverseStringUsingStringBuffer(input);
		System.out.println("String after reverse using StringBuffer : " + reversedString1);
		
		
	}
 
// <<<<<<<<<<<<<<< Way - 1 <<<<<<<<<<<<<<<<<<<<<
	public static String toReverseGivenString(String input) {
		char[] chars = input.toCharArray();
		char[] reversedString = new char[chars.length];
		int counter = 0;

		for (int i = chars.length - 1; i >= 0; i--) {
			reversedString[counter] = chars[i];
			counter++;
		}
		return new String(reversedString);
	}

// <<<<<<<<<<<<<<< Way - 2 <<<<<<<<<<<<<<<<<<<<<
	public static String reverseStringUsingStringBuffer(String input) {

		StringBuffer sb = new StringBuffer(input);
		sb.reverse();
		return new String(sb);
	}
}
