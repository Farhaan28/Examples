package edu_works;
import java.util.*;
public class Colors {

	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<>();
		hs.add("yellow");
		hs.add("pink");
		hs.add("green");
		hs.add("blue");
		hs.add("orange");
		for(String s:hs)
		{
			System.out.println(s.toUpperCase());
		}

		
		


	}

}
