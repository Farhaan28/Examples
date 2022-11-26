package edu_works;

import java.util.Iterator;
import java.util.Scanner;

public class Move {

	
	public static void main(String[] args) {
		Scanner f = new Scanner(System.in);
		System.out.println("Enter Any Word");
		String g =f.next();
		int len = g.length();
		
		for (int i = 0; i <= len-1; i++) {
			char h = g.charAt(i);
			System.out.print((char)(h+2));
		}
		
		

	}

}
