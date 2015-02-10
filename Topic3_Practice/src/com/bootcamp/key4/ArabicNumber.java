package com.bootcamp.key4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArabicNumber {

	private static final int[] VALUES = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

	private static final String[] SYMBOLS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	public static List<String> SYMBOLSLIST = new ArrayList<String>(Arrays.asList(SYMBOLS));

	public int convertToArabic(String roman) {
		int arabic = 0;
		int previous = 0;
		int current = 0;

		for (int i = 0; i < roman.length(); i++) {
			int index = SYMBOLSLIST.indexOf(String.valueOf(roman.charAt(i)));
			current = VALUES[index];
			if (previous < current && previous != 0) {
				current = current - previous;
				arabic -= previous;
			}
			arabic+=current;
			previous = current;
			current = 0;
		}
		return arabic;

	}
}
