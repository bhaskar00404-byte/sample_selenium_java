package JavaProgrammes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// using this we can sort num in a given collection like natural sorting order


public class Sort_Numbers_usingcollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values=new ArrayList<Integer>();
		
	      values.add(506);
	      values.add(407);
	      values.add(505);
	      values.add(607);
			 	    		  
	    Collections.sort(values);
	    		  
	    for (Integer o : values)    
	    {
	    	System.out.println(o);
	    }
		
		
	}

}
