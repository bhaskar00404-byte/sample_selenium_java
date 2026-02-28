package JavaProgrammes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Find Duplicate Elements in Array



public class FindDuplicateElements_in_array {


	    public static void main(String[] args) 
	    {
	        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 3, 5); // Close! Arrays.asList() is actually a method in the Arrays class (part of java.util.Arrays) that returns a fixed-size list backed by the given array.

                                                                      //Think of it like a bridge between arrays and collection
	        
	        Set<Integer> set = new HashSet<>();
	        Set<Integer> duplicates = new HashSet<>();

	        for (int num : list) 
	        {
	            if (!set.add(num)) 
	            {
	                duplicates.add(num);
	            }
	        }
	        System.out.println("Duplicates: " + duplicates); // [2, 3]
	    }
	    
	    
	    
		/*
		 * !set.add(num) is a clever trick!
		 * 
		 * Here's what's happening: - set.add(num) tries to add num to the set. - If num
		 * is already in the set, add() returns false. - The ! negates this result, so
		 * !set.add(num) is true if num is a duplicate.
		 * 
		 * It's equivalent to:
		 * 
		 * if (set.contains(num)) { // duplicate } else { set.add(num); }
		 * 
		 * 
		 * Using !set.add(num) combines the check and add operation, making the code
		 * more concise
		 */
	    
	    
	    
	    
	    
	}
	
	
	

