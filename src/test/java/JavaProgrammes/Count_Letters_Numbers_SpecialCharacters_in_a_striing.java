package JavaProgrammes;


//Count the number of letters, numbers, and special characters in a string


public class Count_Letters_Numbers_SpecialCharacters_in_a_striing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello123!@# World";
        int letters = 0, numbers = 0, specialChars = 0;

        for (char c : str.toCharArray()) 
        {
            if (Character.isLetter(c)) 
            	{
            	letters++;
            	}
            else if (Character.isDigit(c)) 
            	{
            	numbers++;
            	}
            else if (!Character.isWhitespace(c)) 
            {
            	specialChars++;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Numbers: " + numbers);
        System.out.println("Special Chars: " + specialChars);	
		
	
	}

}
