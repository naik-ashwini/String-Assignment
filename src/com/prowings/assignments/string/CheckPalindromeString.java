package com.prowings.assignments.string;

public class CheckPalindromeString {

	public static void main(String[] args) {

		String input = "LEVEL";
		System.out.println("String before reverse : " + input);

		String reversedString = toReverseGivenString(input);
		System.out.println("String after reverse : " + reversedString);
		
		String result = isPalindrome(input) ? "Palindrome!! " : "Not a Palindrome";
		System.out.println(result);

	}

	public static boolean isPalindrome(String input) {
		return input.equals(toReverseGivenString(input));
	}

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
}
