package thikey;

public class  B {
	
	B(){
		this("xyz");
		System.out.println("B -default constructer");
	}
	B(int x){
		
		this();
		System.out.println("B-int");
	}
	B(String s){
		System.out.println("B - String");
	}

}
