package com.prowings.assignments.string;

import java.util.Scanner;

public class CheckAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first String : ");
		String firstString = sc.nextLine();

		System.out.println("Enter second String : ");
		String secondString = sc.nextLine();
		
		String result = areAnagrams(firstString, secondString)? "Two Strings are Anagram!!" : "Two Strings are not Anagram!!";
		System.out.println(result);
	}

	public static boolean areAnagrams(String firstString, String secondString) {
		char[] charArray1 = firstString.toCharArray();
		char[] charArray2 = secondString.toCharArray();

		if (charArray1.length == charArray2.length) {
			for (int i = 0; i < charArray1.length; i++) {
				for (int j = 0; j < charArray2.length; j++) {
					if (charArray1[i] == charArray2[j]) {
						charArray2[j] = ' ';
						break;
					}
				}
			}
			for (int i = 0; i < charArray2.length; i++) {
				if (charArray2[i] != ' ')
					return false;
			}
			return true;
		} else
			return false;
	}
}