

// print stars in a triangle

public class Triangle {

	 public static void main(String[] args) {
	        int rows = 5;
	        for (int i = 1; i <= rows; i++) {
	            // print spaces
	           for (int j = 1; j <= rows - i; j++) {
//	        	for (int j = rows-i; j>=0; j--) {
	                System.out.print(" ");
	            }
	            // print asterisks
	            for (int k = 1; k <= i; k++) {
	                System.out.print("* ");  // for triangle after * we are giving space and for left triagnle no spcae After *
	            }
	            System.out.println();
	        }
	    }
		
}
