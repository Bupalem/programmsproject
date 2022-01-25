package programms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	
	/*
	 * Input : arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}
	 * 
	 * Output : arr[] = {1, 2, 3, 4, 5}
	 * 
	 * new size = 5
	 */
	
	
	public static void remveDuplcateint() {
		
		int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};

		
		Set<Integer> hs=  new HashSet<Integer>();
		
		//ar.add(arr);
		
		for(int j=0;j<arr.length;j++) {
		hs.add(arr[j]);
		
		}
		System.out.println("printing set values"+hs);
	}
	
	public static void remveDuplcatechar() {

		String str = "i am sivapavan";
		//int sizechar=str.length();
		char[] charry=str.toCharArray();
		
		Set<Character> hs=  new HashSet<Character>();
		
		//ar.add(arr);
		
		for(int j=0;j<charry.length;j++) {
			if(hs.contains(charry[j])) {
		
			}else {
				hs.add(charry[j]);
			}
		
		}
		System.out.println("printing set values"+hs);
	
	}
	
	
	public static void main(String args[])
	{
		RemoveDuplicates.remveDuplcateint();
		RemoveDuplicates.remveDuplcatechar();
		
	}
	
	
	
}
