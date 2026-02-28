package JavaProgrammes;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

//take an arrayList and get no of subjects and marks of each subject and add totla marks of all subjects

// no of subjects is dynamic and marks also dynamic and all we take from keyboard

public class ArryaList_Subjects_Marks_Total {

		// TODO Auto-generated method stub
		
	public static void main(String[] args) 
	{	
		
		
	                   	Scanner sc=new Scanner(System.in);
										
						//get no of subjects from keyboard
						System.out.println("Enter no of subjects"); 						
						int nos=sc.nextInt();
					
						// Take marks of each subjects from input depends on no of subjects		
						ArrayList<Integer> Marks=new ArrayList<Integer>();											
						for (int i=1; i<=nos; i++)
						{							
							System.out.println("Enter marks for each subject"+i);
							Marks.add(sc.nextInt());	
					
						}
												
				      //add marks  of total subjects						
						
						 int total=0; 
						 for(int i=0; i<nos; i++) 
						 {
						 
						 total =total+Marks.get(i); // System.out.println(total);
						 }
						 
					    //print  total marks;
						//System.out.println(total);
						// int total = 0;
					    //    for (int mark : Marks) 
					     //   {
					     //       total = total+mark;
					     //   }
						 						
						System.out.println("Subject Marks: " + Marks);
				        //System.out.println("Total Marks: " + total);
				        System.out.println(total);
	        }
		 	

}
