package comm;

import student.main;

public class A {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage collected");
	}

	public static void main(String[] args) throws Throwable {
	
	
	A a=new A();
	Thread thread=new Thread();
	
	System.out.println(a);
	System.gc();
	System.out.println(a);
	}

}
