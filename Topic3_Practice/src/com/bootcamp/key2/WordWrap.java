package com.bootcamp.key2;

public class WordWrap {
	private String str;
	private int rowLength;
	
	public WordWrap(String str, int rowLength){
		this.str = str;
		this.rowLength = rowLength;
	}
	
	public String getWrap(String str){
		if(str.length() <= rowLength){
			return str;
		}else{
			return str.substring(0, rowLength) + "," + getWrap(str.substring(rowLength)); 
		}
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getRowLength() {
		return rowLength;
	}

	public void setRowLength(int rowLength) {
		this.rowLength = rowLength;
	}
	
}