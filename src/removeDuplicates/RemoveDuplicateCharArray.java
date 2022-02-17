package removeDuplicates;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicateCharArray {
	
	public void removeDupcharArrays(String str) {
		
	char ch[]=str.toCharArray();
	HashMap<Character,Integer> hsm= new HashMap<Character,Integer>();
	for(char c:ch) {
		if(hsm.containsKey(c)) {
			
			hsm.put(c, hsm.get(c)+1);
			
		}
		else {
			hsm.put(c, 1);
		}
		
	}
	System.out.println("Total No"+hsm);
	Set<Character> s=hsm.keySet();
	
	
	
	System.out.println("RemoveDupCharacters"+s);

	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="javaprogramming";

		RemoveDuplicateCharArray ar= new RemoveDuplicateCharArray();
	ar.removeDupcharArrays(str); 
	
	}
	
}
