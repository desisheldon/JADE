package seleniumpractice1;

import java.util.HashMap;

public class LetterOccurrence {

	public static void main(String[] args) {
		String str = "sai vaastu";
		HashMap<Character, Integer> letterCount = new HashMap<>();
		// loop through each character in the string
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			// check if character is already in the map
			if (letterCount.containsKey(c)) {
				// increment count by 1 if character already exists
				letterCount.put(c, letterCount.get(c) + 1);
			} else {
				// add character to map with count of 1 if it does not exist
				letterCount.put(c, 1);
			}
		}

		// print results
		for (Character c : letterCount.keySet()) {
			System.out.println(c + ": " + letterCount.get(c));
		}

	}

}
