package com.bootcamp.key1;

public class Check {

	// The Converter methods are in this class
	// but is more efficient create another class, like "ConvertNumberToText"
	// then this class can use those public methods
	// For the purpose of the practice we put it together in this class
	
	private double amount;
	
	//Constructor
	public Check(double amount) {
		this.amount = amount;
	}
	
	//Return the fraction part. Only 2 after the point
	private String getFractionPart(){
		int i = (int) Math.round((amount - (int) amount)*100);
		if(i == 0){
			return " dollars";
		}else{
			return " and " + i + "/100 dollars";
		}
	}
	
	//Return the amount value in text format
	public String toText() {
		int i = getLengthIntPart();
		switch (i) {
		case 1:
			if ((int) amount == 0) {
				return "Error - Insert values betwwen 1 and 999999999";
			} else
				return getUnityString((int) amount) + getFractionPart();
		case 2:
			return getTenString((int) amount) + getFractionPart();
		case 3:
			return getHundredString((int) amount) + getFractionPart();
		case 4:
		case 5:
		case 6:
			return getThousandString((int) amount) + getFractionPart();
		case 7:
		case 8:
		case 9:
			return getMillonString((int) amount) + getFractionPart();
		}
		return null;
	}

	//Return the digit of the ten position
	private int getTenNumber(int i){
		return i/10;
	}
	
	//Return the unit digit converted to Text
	private String getUnityString(int i){
		switch (i) {
		case 1:
			return "One";
		case 2:
			return "Two";
		case 3:
			return "Three";
		case 4:
			return "Four";
		case 5:
			return "Five";
		case 6:
			return "Six";
		case 7:
			return "Seven";
		case 8:
			return "Eight";
		case 9:
			return "Nine";
		}
		return null;
	}
	
	// Return the digit from the ten position to Text
	private String getTenString(int i) {
		int ten = getTenNumber(i);
		int unit = i - ten*10;
		switch (ten) {
		case 1:
			switch (unit) {
			case 1:
				return "Eleven";
			case 2:
				return "Twelve";
			case 3:
				return "Thirteen";
			case 4:
				return "FourTeen";
			case 5:
				return "Fifteen";
			case 6:
				return "Sixteen";
			case 7:
				return "Seventeen";
			case 8:
				return "Eighteen";
			case 9:
				return "Nineteen";
			case 0:
				return "Ten";
			}
		case 2:
			if (unit == 0) {
				return "Twenty";
			} else {
				return "Twenty-" + getUnityString(unit);
			}
		case 3:
			if (unit == 0) {
				return "Thirty";
			} else {
				return "Thirty-" + getUnityString(unit);
			}
		case 4:
			if (unit == 0) {
				return "Forty";
			} else {
				return "Forty-" + getUnityString(unit);
			}
		case 5:
			if (unit == 0) {
				return "Fifty";
			} else {
				return "Fifty-" + getUnityString(unit);
			}
		case 6:
			if (unit == 0) {
				return "Sixty";
			} else {
				return "Sixty-" + getUnityString(unit);
			}
		case 7:
			if (unit == 0) {
				return "Seventy";
			} else {
				return "Seventy-" + getUnityString(unit);
			}
		case 8:
			if (unit == 0) {
				return "Eighty";
			} else {
				return "Eighty-" + getUnityString(unit);
			}
		case 9:
			if (unit == 0) {
				return "Ninety";
			} else {
				return "Ninety-" + getUnityString(unit);
			}
		}
		return null;
	}
	
	private String getHundredString(int i) {
		int hundred = i / 100;
		int ten = i - hundred*100;
		return getUnityString(hundred) + " Hundred " + getTenString(ten);
	}

	private String getThousandString(int i) {
		int thousand = i / 1000;
		int hundred = i - thousand*1000;
		switch(getLength(thousand)){
		case 1:
			return getUnityString(thousand) + " Thousand " + getHundredString(hundred);
		case 2:
			return getTenString(thousand) + " Thousand " + getHundredString(hundred);
		case 3:
			return getHundredString(thousand) + " Thousand " + getHundredString(hundred);
		}
		return null;
	}
	
	private String getMillonString(int i) {
		int millon = i / 1000000;
		int thousand = i - millon * 1000000;
		switch (getLength(millon)) {
		case 1:
			return getUnityString(millon) + " Millon " + getThousandString(thousand);
		case 2:
			return getTenString(millon) + " Millon " + getThousandString(thousand);
		case 3:
			return getHundredString(millon) + " Millon " + getThousandString(thousand);
		}
		return null;
	}
	
	private int getLengthIntPart(){
		int intPart = (int) amount;
		String strPart = Integer.toString(intPart);
		int i = strPart.length();
		return i;
	}
	
	private int getLength(int number){
		String strPart = Integer.toString(number);
		int i = strPart.length();
		return i;
	}
}
