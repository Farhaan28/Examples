package edu_works;

import java.util.*;

public class StudentLogic {

	public static void main(String[] args) {
		
		try {
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter Your Name");
		    String name = sc.next();
		    System.out.println("Enter Your Marks");
		    int[] marks = new int [5];
		    int sum = 0;
		    int p = 0;
		    for (int i = 0; i < 5; i++) {
				marks[i] = sc.nextInt();
            if (marks[i]>100 || marks[i]<0) {
					throw new Exception();
				}
			sum = sum + marks[i];
			
			}
		    p = (sum*100)/500;
		    System.out.println("You Percentage Is:"+p);    
		}
		
	catch(Exception f) {
		System.out.println("Not A Valid Input");
	}

	}

}
