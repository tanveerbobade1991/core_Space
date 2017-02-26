package task5;

public class Override extends Test {

	

	
	 public void m1()
	 {
		 System.out.println("Hie");
		 
	 }
	 
	public static void main(String[] args)
	{
		Test.main(null);
		//Override a=new Override();
	Override o=new Override();
	o.m1();
	System.out.println("Main method over ride");
	
	}

}
