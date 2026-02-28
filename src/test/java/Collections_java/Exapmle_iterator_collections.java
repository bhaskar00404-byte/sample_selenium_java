package Collections_java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exapmle_iterator_collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values=new ArrayList<Integer>();
		
	      values.add(506);
	      values.add(407);
	      values.add(205);
	      values.add(109);
	      // to print one by one we use iterator interface and iterator method
	     
	      Iterator<Integer> it=values.iterator();
	      
	      while(it.hasNext())
	      {
	    	  System.out.println(it.next());
	      }
	      			
	}

}
