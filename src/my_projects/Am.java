package my_projects;
import java.util.*;
public class Am {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         System.out.println("Enter Using AM                  Sentence ");
         String s = sc.nextLine();
         int totalcount = s.indexOf(s);
     	int totalcount_afterRemove = s.replace("am","").length();
     	int count = totalcount+totalcount_afterRemove;
     	System.out.println(count);
	}

}
