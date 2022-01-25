package programms;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersByString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String str="javaprogramming";
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
	
	Set eset=hsm.entrySet();
	Iterator it= eset.iterator();
	while(it.hasNext()) 
	{
		Map.Entry map =(Map.Entry)it.next();
		int n=(int)map.getValue();
		if(n > 1) {
			System.out.println(map.getKey()+":"+map.getValue());
		}
	}
	
	}
}
