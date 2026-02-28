package sample.sample;

public class Demointer2 implements Demointerface
{

	
	public void laptop(String os)
    {
	
	if (os.equalsIgnoreCase("windows")) {
		System.err.println("mylaptop is windows am from Demointer2 class");
		}
	
   }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
				Demointer2 obj=new Demointer2();
				obj.laptop("windows");
		
	}

}
