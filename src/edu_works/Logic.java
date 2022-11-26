package edu_works;
import java.util.stream.*;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.*;

public class Logic{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");
	String a = sc.nextLine();
	char [] ch = a.toCharArray();
	System.out.println(Arrays.toString(ch));
	Arrays.sort(ch);
	System.out.println(Arrays.toString(ch));
	int count = 0;
	for(int i=0; i<ch.length-1; i++) {
		if(ch[i] != ch[i+1]) {
			count++;
		}
	}
	System.out.println(count+1);
	System.out.println(a.chars().mapToObj(c->(char)c).distinct().count());
	System.out.println(a.chars().mapToObj(c->(char)c).distinct().map(c->""+c).collect(Collectors.joining()));

	
	
	
}	
}