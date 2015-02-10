/**
 * 
 */
package e1;


/**
 * @author Christian db
 *
 */
public class converDoubletoText {
	// This should be put into a class like currency or money.

	 static private final String[] UNIT = new String[] {"",
         "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
         "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
     };
     static private final String[] TENS = new String[] {
         "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
     };

     



/**
 * 
 * @param input
 * @return
 */
public static String convert(double input) {
if (input < 0) {return "Minus " + convert(-input);} //negative
long integerPart =  (long) input ; 

int decimalPart = (int)(0.001+(input - integerPart) *100); // yup bigDecimal would be much better but this is TDD so who cares ¬¬
if (0 != integerPart) {
	String ret = convertInger(integerPart) + convertDecimal(decimalPart);
	ret = ret.substring(0,1).toUpperCase()+ret.substring(1);
	return (ret);}
else { return "Zero" + convertDecimal(decimalPart);}
}



/**
 * @param d
 * @return
 */
private static String convertDecimal(int d) {
	//int a =  (int)(d*100);
if (d == 0){return " dollars";}
else {return " and " + (d +"/100 dollars");}

}
public static String convertInger(long integerPart) { 
	// i really dont like how it uses recursion, but this way if the method gets a number bigger than it supports, will answer eg: xx billlon billon millon... dollars,anyway long type can't hold that kind of numbers

	
	if (integerPart < 20){
		return UNIT[(int)integerPart];}
	else if(integerPart < 100){
		return (TENS[(int)(integerPart / 10)-2]+((integerPart % 10 != 0) ? "-" : "")+ UNIT[(int)integerPart % 10]);}
	else if (integerPart < 1000) {
		return UNIT[(int)integerPart / 100] + " hundred" + ((integerPart % 100 != 0) ? " " : "") + convertInger(integerPart % 100);}
	else if (integerPart < 1000000) {
		return convertInger(integerPart / 1000) + " thousand" + ((integerPart % 1000 != 0) ? " " : "") + convertInger(integerPart % 1000);}
	else if (integerPart < 1000000000) {
		return convertInger(integerPart / 1000000) + " million" + ((integerPart % 1000000 != 0) ? " " : "") + convertInger(integerPart % 1000000);}
	//bigger than million this could go as long as i want
	//no point anyway im using long, again this methods should go in a money class, that should use BigDecimal
	return convertInger(integerPart / 1000000000) + " billion"  + ((integerPart % 1000000000 != 0) ? " " : "") + convertInger(integerPart % 1000000000);}


}



