package task5;

public class ExecutionFlow {
	
	
	String b;
	ExecutionFlow()
	{
		
		System.out.println("Constructor is invoked");
		System.out.println();
	}
	ExecutionFlow(String a)
	{	
		
		b=a;
		System.out.println(b);
		System.out.println("Overloaded Constructor is invoked");
	}
	static
	{
		System.out.println("Static Block invoked 1st Always");
		System.out.println();
	}
	{
		System.out.println("Non Static Block is invoked in every constructor");
	}
	public static void main(String[] args) 
	
	{
		ExecutionFlow a= new ExecutionFlow();
		ExecutionFlow b=new ExecutionFlow("HELLO");

	}

}
