package typecas;

public class Test {

	B m1()
	{
		B b=new B();
		b.x=100;
		
		return b;
	}
	public static void main(String[] args) {
		Test t=new Test();
		A a=t.m1();
		// TODO Auto-generated method stub
		
			B b1=(B) a;
		System.out.println(b1.x);

	}

}
