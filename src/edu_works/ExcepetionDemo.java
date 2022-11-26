package edu_works;
import java.util.*;
public class ExcepetionDemo {

	public static void main(String[] args) {
		try {
			Scanner ip = new Scanner(System.in);

			System.out.println("Enter your Name: ");
			String name = ip.next();
			System.out.println("Enter your age:");
			int age = ip.nextInt();
			if (age < 18) {
				throw new Exception();
			}
			System.out.println("Welcome to the Voter appln portal");
		
		} catch (Exception e) {
			System.out.println("You are not allowed access this website");
		}


	}

}
