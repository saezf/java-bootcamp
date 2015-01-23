/**
 * 
 */
package e4;

/**
 * @author Christian db
 *
 */
//Rename this or extend it from a number class so it have some use.
public class Conversor {

	private final static String ROMAN = " IVXLCDM";
	private final static int SINGLE_VALUES[] = {0,1,5,10,50,100,500,1000};
	private final static 	String COMBINED_ROMAN[] = {"M","XM","CM","D","XD","CD","C","XC","L","XL","X","IX","V","IV","I"};
	private final static int COMBINED_VALUES[] = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};




	public String decToRoman(int number) {
	String ret = "";
	int index = 0;
	while ((number > 0) && (index < COMBINED_VALUES.length)) {
	//	if(number >= COMBINED_VALUES[index]){
			while (number >= COMBINED_VALUES[index]){
			ret+= COMBINED_ROMAN[index];
			number = number - COMBINED_VALUES[index];
			}
		//}
		index++;
	}
	return ret;
	}

	public int romanToDec(String roman){
		int ret = 0;char aux = ' '; char peek = ' ';
	
		  for(int i = 0; i < roman.length(); i++){//RECORRER TODA LA FRASE(numero romano)
			  aux = roman.charAt(i);
			  if  (i < roman.length()-1){//So i wont get out of index
				  peek= roman.charAt(i+1);
			  }else { peek = ' ';} //reset so ROMAN.indexOf(peek) < ROMAN.indexOf(aux)
				  if (SINGLE_VALUES[ROMAN.indexOf(aux)] < SINGLE_VALUES[ROMAN.indexOf(peek)]){
					// combined number, add it and skip an i
					  //this makes me realize i could do somthing similar instead of using COMBINED_ROMAN,
					  ret += SINGLE_VALUES[ROMAN.indexOf(peek)] - SINGLE_VALUES[ROMAN.indexOf(aux)];
					  i++; 
					  
				  }else{
					  ret += SINGLE_VALUES[ROMAN.indexOf(aux)];
				  }
			  }
			return ret;  
		  }

	
}
