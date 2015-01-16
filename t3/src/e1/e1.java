/**
 * 
 */
package e1;


/**
 * @author Christian db
 *
 */
public class e1 {

	 static private final String[] UNIT = new String[] {"",
         "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
         "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
     };
     static private final String[] TENS = new String[] {
         "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
     };

     




//public static String convertOld(double input) { //this gonna be ugly
//int integerPart =  (int) input ;
//	if (input < 20){return UNIT[integerPart];}
//	else if(input < 100){return (TENS[(integerPart / 10)-2]+ UNIT[integerPart % 10]);}
//	else return (TENS[(integerPart / 10)-2]+ UNIT[integerPart % 10]);
//		}
/**
 * 
 * @param input
 * @return
 */
public static String convert(double input) {
if (input < 0) {return "Minus " + convert(-input);} //negative
//BigDecimal bd = new BigDecimal(input);
//BigDecimal.longValueExact()
long integerPart =  (long) input ; 
if (0 != integerPart) { return convertInger(integerPart) + convertDecimal(input - integerPart);}
else { return "zero" + convertDecimal(input - integerPart);}
}



/**
 * @param d
 * @return
 */
private static String convertDecimal(double d) {
	int a =  (int)(d*100);
if (a == 0.0){return " dollars";}
else {return " and " + (a +"/100 dollars");}

}
public static String convertInger(long integerPart) {
	if (integerPart < 20){return UNIT[(int)integerPart];}
	else if(integerPart < 100){return (TENS[(int)(integerPart / 10)-2]+((integerPart % 10 != 0) ? "-" : "")+ UNIT[(int)integerPart % 10]);}
	else if (integerPart < 1000) { return UNIT[(int)integerPart / 100] + " hundred" + ((integerPart % 100 != 0) ? " " : "") + convertInger(integerPart % 100);}
	else if (integerPart < 1000000) {return convertInger(integerPart / 1000) + " thousand" + ((integerPart % 1000 != 0) ? " " : "") + convertInger(integerPart % 1000);}
	else if (integerPart < 1000000000) {return convertInger(integerPart / 1000000) + " million" + ((integerPart % 1000000 != 0) ? " " : "") + convertInger(integerPart % 1000000);}
	return convertInger(integerPart / 1000000000) + " billion"  + ((integerPart % 1000000000 != 0) ? " " : "") + convertInger(integerPart % 1000000000);}
}


