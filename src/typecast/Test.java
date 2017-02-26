package typecast;

public class Test {
	

		public static void main(String[] args) {
			 A a=new B();
			 a.m1();//cant call methods and members of Sub classes
			 
			 
			 A a1=new C();
			 a1.m1();
			 
			 A a2=new A();
			 a2.m1();
			 
			 
			 A a3=a2;
			 a3.m1();
		 
		 B b=new B();
		 b.m1();
		 b.m2();
		 
		 
		 B b1=new B();//B b=new B(); explicit type casting
		 b1.m1(); 
		 b1.m2();
		 
		 
		 C c=(C) a2;
		 c.m3();
		 D d=(D)a;
		 		 
		 
		}

	}


