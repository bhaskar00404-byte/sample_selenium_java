package JavaProgrammes;


// find a factorial of number


public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=7,i;
		int res=1;
	//	n! = n *(n-1)*(n-2).......(n-(n-1));
	//ex: 4!=4*3*2*1
		
		for (i=2; i<=n ;i++) 
		{
			res=res*i;
		}
		System.out.println("factorial of   " + n + "   is   " +res);
			
	}

}
