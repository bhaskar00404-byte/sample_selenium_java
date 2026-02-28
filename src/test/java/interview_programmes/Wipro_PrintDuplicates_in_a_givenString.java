package interview_programmes;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Wipro_PrintDuplicates_in_a_givenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		    String input = "abcaedgbcbbf";
	        Set<Character> set = new HashSet<>();
	        Set<Character> duplicates = new HashSet<>();
			
	        
			  for(char c : input.toCharArray())
			  { 
					
					  if (!set.add(c)) 
					  {
					  
					  duplicates.add(c);
					  
					  }
					 				  				  				  				  			  
			  }
			 	        	        
	       //printing elements
	      System.out.println("elements after removing Duplicates :   "+ set);
	      System.out.println("duplicatess :   "+  duplicates); 
	      //printing sizes of elementss
	      System.out.println("size of elements after removing duplictates:  "+set.size());
	      System.out.println("size of duplicates :   "+duplicates.size()); 
	      	      
	            }
	        }