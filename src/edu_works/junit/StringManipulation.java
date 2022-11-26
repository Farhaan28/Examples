package edu_works.junit;

public class StringManipulation{

	public String reverseWord(String str) {
		StringBuilder s = new StringBuilder(str);
		return s.reverse().toString();
	}

	public String reverseCase(String s) {
		
		char ch[] = s.toCharArray();
		String res = "";
		for (char c : ch) {
			if (Character.isUpperCase(c)) {
				res = res + Character.toLowerCase(c);
			}

			else {
				res = res + Character.toUpperCase(c);
			}
		}
		return res;
	}

}
