package JavaProgrammes;

//find max and min in given Array

public class FindMaxorMin_in_a_Given_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5, 2, 6, 4, 3};
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) 
		{
		    
			if (arr[i] > max) 
		    	{
		    	max = arr[i];
		    	}
		    else  if (arr[i] < min) 
		    	{
		    	min = arr[i];
		    	
		    	}
		 		    
		    
		    
		}
		System.out.println("Max: " + max); // 9
		System.out.println("Min: " + min); // 1		
		
		

	}

}
