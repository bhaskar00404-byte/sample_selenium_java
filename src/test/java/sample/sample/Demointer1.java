package sample.sample;

public class Demointer1 implements Demointerface
{
		public void laptop(String os)
	     {
		
		if (os.equalsIgnoreCase("mac")) {
			System.out.println("mylaptop is mac  continue working with mac scripts------iosapps");
			}
		
		
		if (os.equalsIgnoreCase("windows")) {
			System.out.println("mylaptop is windows  continue working with windows based scripts---android apps");
			}
	    }
	

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		
		Demointer1 obj=new Demointer1();
		obj.laptop("windows");
		
		

	}

}
