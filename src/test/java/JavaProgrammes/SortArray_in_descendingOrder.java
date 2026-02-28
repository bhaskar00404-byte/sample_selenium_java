package JavaProgrammes;

import java.util.Arrays;

//writing a programme for sorting in descending order

public class SortArray_in_descendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       int[] arr = {5, 2, 8, 1, 9};
		
		for (int i = 0; i < arr.length; i++) //loop runs n times
		{
		    for (int j = 0; j < arr.length-1; j++)   //loop runs n-1 times
		   {
		       if (arr[j] < arr[j+1])
		      {
		    	
	         // swap arr[j] and arr[j+1]		    	
		        int temp = arr[j];
		        arr[j] = arr[j+1];
		        arr[j+1] = temp;
		        
		     }
		}
				
	 }

		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
	}

}
