package com.bootcamp.romanconverter;

public class Decimal {

	private int roman;
	

	public Decimal(int roman) {
		this.roman = roman;
		
	}

	public String toRoman() {
		String rom[] = {"M","XM","CM","D","XD","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int arab[] = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		StringBuilder result = new StringBuilder();
			int i = 0;
		    while (roman > 0 || arab.length == (i - 1)) {
		        while ((roman - arab[i]) >= 0) {
		            roman -= arab[i];
		            result.append(rom[i]);
		        }
		        i++;
		    }return result.toString();
		}

}
