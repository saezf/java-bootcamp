/**
 * 
 */
package e2;

import java.util.ArrayList;

/**
 * @author Christian db
 *
 */
public class WordWrapping {

/**
 * 
 * @param rowLength
 * @param inputString
 * @return 
 */
	public static ArrayList<String> getWordWrappedRows(int rowLength, String inputString) {
	String splitted[]  = inputString.split(" ");
	ArrayList<String> ret = new ArrayList<String>();
	int i = 0;
	String aux = "";
		while (i < splitted.length){//NEOInput
			aux += splitted[i];
			if (rowLength >= aux.length()){// First word of the row fits
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
if (aux != "") {ret.add(aux.trim());}

	return ret;
		}
	
	
	//added this to make clean tests
	public static String toString(ArrayList<String> rows) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0 ; i < rows.size() - 1; i++)
		{
			sb.append(rows.get(i)).append("\n");
		}
		sb.append(rows.get(rows.size()-1));
		return sb.toString();
	}
	public static String toString(int rowLength, String inputString) {
		ArrayList<String> rows=	getWordWrappedRows(rowLength,inputString);
		StringBuilder sb = new StringBuilder();
		for (int i = 0 ; i < rows.size() - 1; i++)
		{
			sb.append(rows.get(i)).append("\n");
		}
		sb.append(rows.get(rows.size()-1));
		return sb.toString();
	}
	}

