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
		names.add("Mike");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String i : names) {
		System.out.println(i);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < names.size(); i++) {
			if(i%2 == 0) {
				System.out.println(names.get(i));
			}

		}
		//6. Print all the Strings in reverse order.
		System.out.println("");
		for (int i = names.size()-1; i >=0; i--) {
			System.out.println(names.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		System.out.println("");
		for(String name : names) {
			if(name.contains("e")) {
				System.out.println(name);
			}
		}
	}
}
