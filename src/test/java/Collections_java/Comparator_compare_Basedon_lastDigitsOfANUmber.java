package Collections_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// sort the values based on last digit of a number (we use comparator)
public class Comparator_compare_Basedon_lastDigitsOfANUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values=new ArrayList<Integer>();
		
	      values.add(506);
	      values.add(407);
	      values.add(205);
	      values.add(109);
	      
	      Comparator<Integer>  com=new Comparator<Integer>()
	      {
	    	  public int compare(Integer i, Integer j)
	    	  {
	    	  
	    	 // return Integer.compare(i%10, j%10);
	    		  
	    		  if (i%10>j%10)
	    		  {
	    			  return 1;
	    		  }
	    		  else
	    		  {
	    			  return -1;
	    		  }
	    	  
	    	  }
	      };
		
	      Collections.sort(values, com);
	      
	      for (Integer o : values) 
	      {
	          System.out.println(o);
	      }      

			/*
			 * Collections.sort(values, com); - Sorts the values in  list. - 
			 * Uses the custom com  (com definig the sorting order)
			 * Comparator. - Rearranges elements based on last digit (as defined in com).
			 * 
			 * Modifies the original values list
			 * 
			 * 
			 * 
			 */     
	      
	      
	      	      
	}

}
