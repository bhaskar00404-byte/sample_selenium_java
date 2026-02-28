package JavaProgrammes;

//Reverse characters in given String

public class Reverse_charcters_in_a_String {
	
	 public static void main(String[] args) {
				 
			String str="bhaskar";
			String reverse="";
			int l=str.length();
			for(int i=l-1; i>=0; i--)
			{
				char h=str.charAt(i);
				reverse=reverse+h;     //java automatically converts char into string
				
				
		// or else we can use str.concat(string.valueof(h))		
				
			}
			
			System.out.println("original string is "+str);
			System.out.println("reversed string is "+reverse);
			
			
		    }
}