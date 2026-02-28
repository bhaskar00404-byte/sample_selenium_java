package JavaProgrammes;

//Reverse words in String



public class Reverse_Words_ina_String {
	
	    public static void main(String[] args) {
	        String str = "I am from Mumbai";
	        String[] words = str.split(" ");
	        int l=words.length;
	        		
	        		
	        String reversed = "";

	        for (int i =l-1; i >= 0; i--) {
	        	String s=words[i];
	           // reversed= reversed+words[i] + " ";
	        	
	        	reversed=reversed+s+" ";
	        }

	        System.out.println("Original String: " + str);
	        System.out.println("Reversed String: " + reversed.trim());
	    }
	}
	
	

