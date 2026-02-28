package JavaProgrammes;


//find sum of digits



public class Sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int sum=0;
			int num=12345;
			while(num>0)
			{
			
			  sum=sum+num%10;
			  num=num/10;
				
			}
		
		
        System.out.println(sum);		
		
				
	}

}
