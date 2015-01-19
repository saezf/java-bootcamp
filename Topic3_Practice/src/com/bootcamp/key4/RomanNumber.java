package com.bootcamp.key4;

public class RomanNumber {

	private static final int[] VALUES = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

	private static final String[] SYMBOLS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	public String convertToRoman(int arabic) {
		StringBuilder sb = new StringBuilder();
		
		int remaining = arabic;
		
		for(int i=0; i < VALUES.length;i++){
			remaining = convert(remaining, VALUES[i], SYMBOLS[i],sb);
				
		}
		return sb.toString();
	}

	private int convert(int remaining, int value, String roman, StringBuilder sb) {
		while(remaining >= value){
			sb.append(roman);
			remaining-= value;
		}
		return remaining;
	}
}
