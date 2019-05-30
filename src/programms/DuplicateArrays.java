package programms;

import java.util.HashMap;
import java.util.Set;

public class DuplicateArrays {

public void duplicate_Array(int[] arr) {
	HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
	for (int a: arr) {
		if(hmap.containsKey(a)) {
			hmap.put(a, hmap.get(a)+1);
		}
		else
		{
			hmap.put(a, 1);
		}
		
	}
	
	
	Set<Integer> intval = hmap.keySet();
	
for(int one:intval) {
	if(hmap.get(one)>1) {
System.out.println(one);		
	}
}
	
	
}

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= new int[] {22,55,22,261,281};

DuplicateArrays ar= new DuplicateArrays();
ar.duplicate_Array(arr); 
		


}}
