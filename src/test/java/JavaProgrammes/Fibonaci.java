package JavaProgrammes;


//write a programme for fibonaci series for n terms
public class Fibonaci {

	public static void main(String[] args) {
        int n = 10; // number of terms
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }	
	
	
	
}
