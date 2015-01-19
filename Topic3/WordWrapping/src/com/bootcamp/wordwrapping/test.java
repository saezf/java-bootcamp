package com.bootcamp.wordwrapping;

public class test{
private static final String newline = System.getProperty("line.separator");

public static String wordWrap(String in, int length) {
    //:: Trim
    while(in.length() > 0 && (in.charAt(0) == '\t' || in.charAt(0) == ' '))
        in = in.substring(1);
    
    //:: If Small Enough Already, Return Original
    if(in.length() < length)
        return in;
    
    //:: If Next length Contains Newline, Split There
    if(in.substring(0, length).contains(newline))
        return in.substring(0, in.indexOf(newline)).trim() + newline +
               wordWrap(in.substring(in.indexOf("\n") + 1), length);
    
    //:: Otherwise, Split Along Nearest Previous Space/Tab/Dash
    int spaceIndex = Math.max(Math.max( in.lastIndexOf(" ",  length),
                                        in.lastIndexOf("\t", length)),
                                        in.lastIndexOf("-",  length));
    
    //:: If No Nearest Space, Split At length
    if(spaceIndex == -1)
        spaceIndex = length;
    
    //:: Split
    return in.substring(0, spaceIndex).trim() + newline + wordWrap(in.substring(spaceIndex), length);
}

	public static void main(String[] args) {

    String aux = wordWrap("Goodbye, World!",7);
    System.out.println(aux);
}
}
