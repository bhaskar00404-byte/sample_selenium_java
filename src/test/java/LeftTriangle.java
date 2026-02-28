
// print stars in left triangle
public class LeftTriangle {
	
	 public static void main(String[] args) {
	        int rows = 5;
	        for (int i = 1; i <= rows; i++) {
	            // print spaces
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }
	            // print asterisks
	            for (int k = 1; k <= i; k++) {
	            	
//The space after the asterisk(* ) is the key difference between the left triangle and triangle patterns           	
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	
}
