package removeDuplicates;

import java.util.HashMap;
import java.util.Set;

import programms.DuplicateArrays;

public class RemoveDuplicateIntegerArrays {

	
	public void duplicate_Array(int[] arr) {
		
		HashMap<Integer,Integer> hs= new HashMap<Integer,Integer>();
		for(int a:arr) {
			if(hs.containsKey(a)) 
			{
				hs.put(a, hs.get(a)+1);
			}else {
				
				hs.put(a,1);
			}
			
		}
		
		Set<Integer> st=hs.keySet();
		
		System.out.println("Removed Duplicated Integer"+st);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= new int[] {22,1445,1278,22,281};

		RemoveDuplicateIntegerArrays ar= new RemoveDuplicateIntegerArrays();
		ar.duplicate_Array(arr); 
		
		
	}

}
