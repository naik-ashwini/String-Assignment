package com.prowings.assignments.string;

import java.util.Scanner;

public class ConvertRomanToInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Roman Number : ");
		String romanNumber = sc.nextLine();

		int result = romanToInteger(romanNumber);
		System.out.println("It's Integer Value is : " + result);

	}

	public static int value(char roman) {
		if (roman == 'I')
			return 1;
		if (roman == 'V')
			return 5;
		if (roman == 'X')
			return 10;
		if (roman == 'L')
			return 50;
		if (roman == 'C')
			return 100;
		if (roman == 'D')
			return 500;
		if (roman == 'M')
			return 1000;

		return -1;
	}

	public static int romanToInteger(String romanNumber) {
		int total = 0;

		for (int i = 0; i < romanNumber.length(); i++) {
			int s1 = value(romanNumber.charAt(i));
			if (i + 1 < romanNumber.length()) {
				int s2 = value(romanNumber.charAt(i + 1));
				if (s1 >= s2) {
					total = s1 + total;
				} else {
					total = total - s1;
				}
			} else
				total = s1 + total;
		}
		return total;
	}
}
