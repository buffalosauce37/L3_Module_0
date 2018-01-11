package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		
		ArrayList<String> names = new ArrayList<String>();
		
		//   Don't forget to import the ArrayList class
		
		//2. Add five Strings to your list
		names.add("Coach");
		names.add("Jack");
		names.add("Roberto");
		names.add("Nancy");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
