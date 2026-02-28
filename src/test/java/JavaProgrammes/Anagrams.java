package JavaProgrammes;

import java.util.Arrays;

//check if two Strings are anagrams
//Anagrams are words/phrases formed by rearranging letters of another word/phrase,
//using all original letters exactly once. Like "listen" and "silent"

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "listen";
		String s2 = "silent";
		char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean b = Arrays.equals(c1, c2);    //boolean returns true if two are equal otherwise false		
		if(b==true)
	
		{
			System.out.println("s1,s2 are anagrams");
		}
		else
		{
			System.out.println("s1,s2 are not anagrams");
		}
	}

		
}
