package practice;

import java.util.HashMap;

public class occurance_of_char {

	static void charcount(String value) {

		HashMap<Character, Integer> cout = new HashMap<>();

		char[] c = value.toCharArray();

		for (char ch : c) {

			if (cout.containsKey(ch)) {

				cout.put(ch, cout.get(ch) + 1);
			}

			else {

				cout.put(ch, 1);
			}

		}
		System.out.println(cout);
	}

	public static void main(String[] args) {

		charcount("siddhartha");

	}

}
