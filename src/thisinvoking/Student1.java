package thisinvoking;

public class Student1 {

	void m1()
	{
		System.out.println("Invoking Method");
	}

	void m2()
	{this.m1();
		System.out.println("Tanveer");
	}
}
