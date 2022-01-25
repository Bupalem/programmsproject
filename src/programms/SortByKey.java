package programms;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortByKey {

	public static void main(String args[]) {
		
		HashMap<Integer, String> hkey= new HashMap<Integer, String>();
		hkey.put(33, "siva");
		hkey.put(22, "sivapavan");
		hkey.put(99, "nag");
		hkey.put(11, "raju");
		
		System.out.println("Before Sorting by Key:");
		Set sint= hkey.entrySet();
		
		Iterator it=sint.iterator();
		while(it.hasNext()) {
			
			Map.Entry pair=(Map.Entry)it.next();
			//System.out.println(pair);
			System.out.println(pair.getKey()+";"  +pair.getValue());
			//System.out.println(it.next().toString());
		}
		
		
		
		Map<Integer, String> tkey= new TreeMap<Integer, String>(hkey);
		Set st= tkey.entrySet();
		Iterator e= st.iterator();
		System.out.println("After Sorting by Key:");
		while(e.hasNext()) {
			
			System.out.println(e.next().toString());
		}
		
	}
	
	
}
