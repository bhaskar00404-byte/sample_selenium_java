package JavaProgrammes;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		 String str = "madam";
	     String reverse = "";
	     int l = str.length();
	     for (int i = l - 1; i >= 0; i--) {
	         char h = str.charAt(i);
	         reverse = reverse + h;  //Java automatically converts char into String
	     }
	    
	     if (str.equals(reverse)) {
	         System.out.println("It's a palindrome!");
	     } else {
	         System.out.println("Not a palindrome.");
	     }		
		
						
	}

}
