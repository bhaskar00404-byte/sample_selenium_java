package JavaProgrammes;
import java.util.*;


// in this way we are using arrays for taking inputs
//here we are using set and hashset for finding unique and duplicate elements

public class FindDuplicatesInArray_way2 {

	

	
	    public static void main(String[] args) 
	    {
	        
	    	int[] arr = {1, 2, 3, 4, 2, 3, 5};
	    	
	    	//List<Integer>   values=Arrays.asList(1, 2, 3, 4, 2, 3, 5);
	    	
	        Set<Integer> set = new HashSet<>();
	        Set<Integer> duplicates = new HashSet<>();

	        for (int num : arr) 
	        {
	            if (!set.add(num)) 
	            {
	                duplicates.add(num);
	            }
	        }
	        System.out.println("Duplicates: " + duplicates); // [2, 3]
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	

