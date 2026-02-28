import java.util.Scanner;
//Print Prime numbers for given Limit




public class PrimeNumbers {

	public static void displayPrimes(int limit) 
	
	{
        System.out.println("Prime numbers up to " + limit + " are:");
        int prime=0;
        
        for (int num = 2; num <= limit; num++) 
        {
            
            for (int i = 2; i <= Math.sqrt(num); i++) 
            {
                if (num % i == 0) {
                    prime=1;
                    break;
                }
            }
            
            if(prime==0)
            {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a limit: ");
        int limit = scanner.nextInt();
        displayPrimes(limit);

	}
    
   

}
