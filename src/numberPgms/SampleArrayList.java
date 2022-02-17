package numberPgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleArrayList {


	public static void main(String[] args) {
		List<String> li= new ArrayList<String>();
		li.add("Siva");
		li.add("bupalem");
		li.add("Sivapavan");
		li.add("ManiKiran");
		
		long ler=li.stream().filter(s->s.contains("a")).count();
	//	li.stream().filter(s->s.length()>4).forEach(s->System.out.println("Greater Than 4 letters in string:"+s));
		
	//	li.stream().filter(s->s.length()>4).forEach(s->System.out.println("Greater Than 4 letters in string:"+s));
		
		System.out.println("Duplciates check:"+ler);
		
		li.stream().filter(s->s.endsWith("n")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		li.stream().filter(s->s.endsWith("n")).sorted().forEach(s->System.out.println(s));
		
		
		//List<Integer> liint= Arrays.asList(3,2,9,4,55,888,33);
		//String str=liint.toString();
		
		
	}
	
	
}
