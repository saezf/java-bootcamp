package com.bootcamp.romanconverter;

public class Roman {

	private String decimal;

	public Roman(String decimal) {
		this.decimal = decimal;
		
	}

	public int toDecimal() {
		char roman[]= {' ','I','V','X','L','C','D','M'}; //
	    int values[] = {0,1,5,10,50,100,500,1000};//SE LE DA VALOR A LA LETRAS
	    int before = 0;
	    int sum = 0;
	    char aux = ' ';
	    for(int i = 0; i < decimal.length(); i++){//RECORRER TODA LA FRASE(numero romano)
	    	aux = decimal.charAt(i);
	        	for(int j = 0; j < roman.length; j++){//RECORRE ARREGLO ROM
	        		if(aux == roman[j]){//si letra recorrida = a letra contenida en rom                 
	        			sum += values [j]; //sumar el valor de la letra
	                    if( before < values[j]){ //si el valor de letra anterior menor a valor letra   //actual
	                    	sum -= before*2 ; // restale el doble del menor de los dos
	                        before = values[j]; // valor anterior = valor letra actual
	                    }else {//si no se cumple lo anterior  
	                        before = values[j];//el dato actual se guarda en anterior
	                    }
	        		}              
	            }
	     }
	    return sum;
	}
	
	

}
