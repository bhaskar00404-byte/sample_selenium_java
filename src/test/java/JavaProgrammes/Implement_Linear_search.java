package JavaProgrammes;

//implementing linear search


public class Implement_Linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

             int[] arr= {1,4,6,8,9}	;
             int  target=8;
             for (int i=0;i<arr.length ;i++)
             {
            	 if(arr[i]==target) 
            	 {
            		System.out.println("found at index of :"+ i); 
            		break;
            	 }
             }
		
	}

}
