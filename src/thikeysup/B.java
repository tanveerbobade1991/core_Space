package thikeysup;

public class B {

	B()
	{
		this("xyz");
		System.out.println("B ideffault constructer");
	}
B(int x)
{
	System.out.println("B-int");
	}
B(String s)
{  super();
	System.out.println("B-string");
	
}
}

