package com.prowings.assignments.string;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		String input = "aaccbda";
		System.out.println("Input String is : " + input);

		String result = removeDuplicateCharsFromString(input);
		System.out.println("String after removing all duplicates : "+result);
	}

	public static String removeDuplicateCharsFromString(String s1) {
		char[] chars = s1.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j])
					chars[j] = ' ';
			}
		}
		String result = new String(chars);
		result = result.replace(" ", "");
		return result;

	}
}
