package programms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GetUniqueCharacters {
	
	public static void remveDuplcatechar() {

		String str = "i am sivapavan";
		//int sizechar=str.length();
		char[] charry=str.toCharArray();
		
		HashMap<Character, Integer> hs=  new HashMap<Character, Integer>();
		
		//ar.add(arr);
		
		for(char c:charry) {
			if(hs.containsKey(c)) 
					{
				hs.put(c,hs.get(c)+1);
			}else {
				hs.put(c,1);
			}
		
		}
		
		Set st= hs.entrySet();
		
		
		Iterator it=st.iterator();
		while(it.hasNext()) {
		if(it.next().toString().toString().contentEquals("1")) {
				
		}
		
		
			//System.out.println("Print statement"+it.next().toString().toString().contentEquals("1"));
		}
		
		
		//System.out.println("printing set values"+hs);
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetUniqueCharacters.remveDuplcatechar();
		
	}
}
