package edu_works;
import java.util.*;
class InvalidCountryException extends Exception{
	 public InvalidCountryException(String s) {
		 super(s);	
	}
}

public class Passport {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name = sc.next();
		System.out.println("Enter Your Id:");
		int id = sc.nextInt();
		System.out.println("Enter Your Pan Id:");
		int pan = sc.nextInt();
		System.out.println("Enter Your Address:");
		String add = sc.next();
		System.out.println("Enter Your State:");
		String state = sc.next();
		System.out.println("Enter Your Country:");
		String count = sc.next();
		if (!count.equalsIgnoreCase("India")) {
			throw new InvalidCountryException("Not Indian");
		}
		else if  (!state.equalsIgnoreCase("Delhi")) {        throw new InvalidCountryException("Not Delhi");	
		}
		}
		catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Application Submitted");
		}
		

	}

}
