//print stars in Right Triangle

public class RightTriangle {

	public static void main(String[] args) 
	{
        int rows = 5;
        for (int i = 1; i <= rows; i++)
        {
            // print asterisks
            for (int k = 1; k <= i; k++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
	
}