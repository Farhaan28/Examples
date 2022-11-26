package my_projects;

import java.util.Iterator;

public class Strings {

	public static void main(String[] args) {
	/*	String name = "Farhaan";
		String fullname = "Khan";
		String sentence = "My Name Is Farhaan Khan";
				System.out.println(name+ "," + fullname + "," + sentence);
	*/
		
		
		/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Full Name:");
		String name = sc.nextLine();
		System.out.println("Your Name Is :" + name);
   */
		
		
		//Concatenation
	/*	String firstname = "Farhaan";
		String lastname = "Khan";
		String fullname = firstname +  " " + lastname;
		System.out.println(fullname);
	*/
		
	/*	String firstname = "Farhaan";
		String lastname = "Khan";
		String fullName = firstname +  " " + lastname;
		System.out.println(fullName.length());
    
		
		//CharAt
		for (int i = 0; i<fullName.length(); i++) {
			System.out.println(fullName.charAt(i));
		}
		*/
		
		
		//Compare
		/*		String name = "Farhaan";
		String name1 ="Farhaan";
		
		// 1  s1 > s2 :+ Positive Value
		// 2  s1 == s2 : 0
		// 3  s1 < s2 : - Negetive Value
		
		if (name.compareTo(name1)== 0) {
			System.out.println("Strings Are Equal");	
			}
		else {
			System.out.println("Strings Are Not Equal");
		}
		*
		if (name == name1) {
			System.out.println("Strings Are Equal");	
			}
		else {
			System.out.println("Strings Are Not Equal");
		}
		
		if ( new String("Farhaan") == new String("Farhaan")) {
			System.out.println("Strings Are Equal");	
		}
		else {
			System.out.println("String Are Not Equal");
		}
		*/
		
		
		// Sub Strings
	/*	String Sentences = "My Name Is Farhaan";
		String name = Sentences.substring(11, Sentences.length());
		System.out.println(name);
		*/
	 
	/*	String Sentences = "FarhaanKhan";
		String name = Sentences.substring(0,7);
		System.out.println(name);
	*/
		String Sentences = "FarhaanKhan";
		String name = Sentences.substring(7);
		System.out.println(name);
	
		// Strings are Immutable

	}
		
	}


