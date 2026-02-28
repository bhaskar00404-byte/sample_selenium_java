package JavaProgrammes;


// find Vowels and consonants in a given String
public class CountVowels_consonants_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "bhaskar";
		int vowels = 0, consonants = 0;
		for (char c : str.toLowerCase().toCharArray())
		{			
			   if (c >= 'a' && c <= 'z')   //we are checking character in between a and z ...
				                           //in  AsCii value of a is 97 and ASCII value of z is 122
			     
			    {
			        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			        	
			        	{
			        	    vowels++;
			        	}
			        else 
			        	{
			        	     consonants++;
			        	}
			    }
		}
		
		
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);	
				
	}

}
