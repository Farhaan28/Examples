package edu_works;
import java.util.*;
public class Employee {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a number: ");
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(Integer.parseInt(sc.next()));
		hs.add(Integer.parseInt(sc.next()));
		hs.add(Integer.parseInt(sc.next()));
		hs.add(Integer.parseInt(sc.next()));
		
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext())
				System.out.println(it.next());
	

	}
	}
 
