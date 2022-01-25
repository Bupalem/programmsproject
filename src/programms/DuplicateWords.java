package programms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String statement="dog barks bo bo dog";
		String str[]=statement.split(" ");
		HashMap<String, Integer> hs= new HashMap<String, Integer>();
		for(String var:str) {
			if(hs.containsKey(var)) {
				
				hs.put(var, hs.get(var)+1);
			}
			else {
				hs.put(var, 1);
			}
			
		}
		
		/*
		 * Set s= hs.entrySet(); Iterator it=s.iterator();
		 * 
		 * 
		 * 
		 * while(it.hasNext()) { Map.Entry map=(Map.Entry)it.next(); int
		 * n=(int)map.getValue(); if( n> 1) {
		 * 
		 * System.out.println( map.getKey() +":"+map.getValue()); }
		 * 
		 * 
		 * }
		 * 
		 */
		
		
		Set<String> fs= hs.keySet();
	for(String es:fs) {
		if(hs.get(es)>1){
			System.out.println(es);
		}
	}
		
	}

}
