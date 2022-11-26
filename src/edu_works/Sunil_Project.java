package edu_works;
import java.util.*;

public class Sunil_Project {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Input");
		String x = sc.next();
		System.out.println("Enter 2nd Input");
		String y = sc.next();
		int i,j, count = 0;
		for (i = 0, j = 0; i < x.length() && j < y.length();i++,j++) {
			if (x.charAt(i) == '?' || y.charAt(j) == '?') 
				count++;
		 else if (x.charAt(i) !=y.charAt(j))
			 break;
		}
		 if (i == x.length() && j ==y.length())
			 System.out.println("Yes");
		 else
			System.out.println("No");
		
	}

}
