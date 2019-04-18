package programms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "MyJava";
		 
	        //1. Using StringBuffer Class
	 
	        StringBuffer sbf = new StringBuffer(str);
	 
	        System.out.println(sbf.reverse());
	        
	        //2. Second way
	        
	        char[] ch=str.toCharArray();
	        String rev="";
	        for(int i=ch.length-1; i>=0; i--)
	        {
	        	 rev=rev+ch[i];
	        }
	        System.out.print("Second way:");
	        System.out.println(rev);
	        System.out.print("third way:");
	        System.out.println(Fibnocaii(str));
	}
	        
	        //3. Third way    
	        static String Fibnocaii(String str) {
	        	if((null==str||str.length()<=1))
	        	{
	        		return str;
	        	}
	        	
	        	return Fibnocaii(str.substring(1)) + str.charAt(0);
	        }
	        
	        
	        
	        		}


