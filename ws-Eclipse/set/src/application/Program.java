package application;

import java.util.HashSet;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		
		
		// Set<String> set = LinkedHashSet<>();
		// Set<String> set = TreeSet<>();
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		// set.remove("Tablet");
		// set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'T');
						
		for (String p : set) {
			System.out.println(p);
		}
	}
}