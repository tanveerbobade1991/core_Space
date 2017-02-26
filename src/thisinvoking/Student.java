package thisinvoking;

public class Student {

	int id;
	String name;
	
	Student ()
	{
		System.out.println("Default constructer invoked");
		
	}
	
	public Student(int id ,String name) {
		this();
		this.id=id;
		this.name=name;
		
		// TODO Auto-generated constructor stub
	}

	void display()
	{
		System.out.println(id+""+name);
		
	}}
