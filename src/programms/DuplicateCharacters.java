package programms;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Java Programming";
		char[] arr = str.toCharArray(); 
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (char c : arr) {

			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) + 1);// hasmap.get(c) will get the value
			} else {
				hmap.put(c, 1);

			}
		}

		Set<Character> chstring = hmap.keySet();

		for (Character c : chstring) {
			if(hmap.get(c)>1) {

			System.out.println(c + ":" + hmap.get(c));
			}
		}

	}

}
