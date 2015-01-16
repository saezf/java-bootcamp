/**
 * 
 */
package e2;

import java.util.ArrayList;

/**
 * @author Christian db
 *
 */
public class e2 {

	/**
	 * @param i
	 * @param string
	 */
	public static ArrayList<String> getWordWrappedRows(int rowLength, String inputString) {
	String splitted[]  = inputString.split(" ");
	ArrayList<String> ret = new ArrayList<String>();
	int i = 0;
	String aux = "";
		while (i < splitted.length){//NEOInput
			aux += splitted[i];
			if (rowLength >= aux.length()){// First word fits
			while ((i+1 < splitted.length) && (1 + (aux.length() + splitted[i+1].length()) <= rowLength )){
				aux += " " + splitted[i+1]; i++;
			}
			
			ret.add(aux.trim());
			aux = "";
			i++;
			}else{// first word is too long
				while (aux.length() >= rowLength){
					int top = (rowLength > aux.length()) ? aux.length() : rowLength;
					ret.add(aux.substring(0, top));
					aux = aux.substring(top);
				}
				aux += " ";
				i++;
			}
		}
if (aux != "") {ret.add(aux);}
	return ret;
		}

	}

