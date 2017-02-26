package task5;

public class Overloading {

 int c;
	void m2()
	{
		System.out.println("Addition Method is invoked");
	}
	
	void m2(int a,int b)
	{
		c = a+b;
		System.out.println("Addition Method of 2 Parameters invoked "+c);
		
	}
final	void m2(int a,int b,int c)
	{
		int d = a+b+c;
		System.out.println("Addition Method of 3 Parameters invoked "+d);
		
	}
	void m2(int a,int b,int c,int d)
	{
		int e = a+b+c+d;
		System.out.println("Addition Method of 4 Parameters invoked "+e);
		
	}
	public static void main(String[] args)
	{
		Overloading a=new Overloading();
		a.m2();
		a.m2(12, 12);
		a.m2(12, 12, 12);
		a.m2(12, 12, 12, 12);
	}

}
