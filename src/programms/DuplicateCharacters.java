package programms;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Java Programming";
		char[] arr = str.toCharArray();
		HashMap<Character, Integer> hasmap = new HashMap<Character, Integer>();
		for (char c : arr) {

			if (hasmap.containsKey(c)) {
				hasmap.put(c, hasmap.get(c) + 1);// hasmap.get(c) will get the value
			} else {
				hasmap.put(c, 1);

			}
		}

		Set<Character> chstring = hasmap.keySet();

		for (Character c : chstring) {

			System.out.println(c + ":" + hasmap.get(c));

		}

	}

}
