package JavaProgrammes;

import java.util.ArrayList;
import java.util.Scanner;


//take an arrayList and get no of subjects and marks of each subject and add totla marks of all subjects




public class Arryalist_marks {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter number of subjects: ");
	        int n = scanner.nextInt();

	        ArrayList<Integer> marks = new ArrayList<>();
	        for (int i = 1; i <= n; i++) {
	            System.out.print("Enter marks for Subject " + i + ": ");
	            marks.add(scanner.nextInt());
	        }

	        int total = 0;
	        for (int mark : marks) {
	            total += mark;
	        }

	        System.out.println("Subject Marks: " + marks);
	        System.out.println("Total Marks: " + total);
	    }
	
	
	
}
