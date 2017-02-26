package typecas;

public class Test1 {
Object m1(){
	A b=new A();
	b.x=100;
	return b;
}
	public static void main(String[] args) {
		Test1 t=new Test1();
		Object a=t.m1();
		A b= (A) a;
		System.out.println(b.x);

	}

}
