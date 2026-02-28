package JavaProgrammes;


//sort characters in a given String

import java.util.Arrays;

public class Sorting_characters_in_a_Strring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "bhaskar";
		char[] chars = str.toCharArray();
	          Arrays.sort(chars);
		
		  String sorted = new String(chars); // character to String Conversion "Chars.toString()" presents implicitely
		  System.out.println(sorted); // aabhkrs
		 		
		
	}

}
