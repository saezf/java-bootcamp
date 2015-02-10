package com.bootcamp.wordwrapping;

public class WordWrapping {

	public static  String wordWrap(String s, int length) {
		if (s == null)
			return "";

		if (s.length() <= length) {
			return s;
		} else {
			int space = s.substring(0, length + 1).lastIndexOf(" ");
			if (space >= 0)
				return s.substring(0, space) + "\n"
						+ wordWrap(s.substring(space + 1), length);
			else
				return s.substring(0, length) + "\n"
						+ wordWrap(s.substring(length), length);
		}
}

	
}
