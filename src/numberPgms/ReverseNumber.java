package numberPgms;

public class ReverseNumber {
	
	public void type1(int nbr){
		
		int rem;
		int sum=0;
		
		while(nbr!=0) 
		{
			rem=nbr%10;
			sum=sum*10+rem;
			nbr=nbr/10;
			
		}
		System.out.println("Reverse Nbr: "+sum);
	}
public void type2(int nbr){
		
	String st=String.valueOf(nbr);
	
	//System.out.println("i value"+st.length());
	//System.out.println("st  value"+st);
	
	
	
	
	for(int i=st.length(); i>0;i--)
	{
		System.out.print(st.charAt(i-1));
		
		
	}
	


}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nbr=4657;
		ReverseNumber rr= new ReverseNumber();
		rr.type1(nbr);
		rr.type2(nbr);
		
		
	}

}
