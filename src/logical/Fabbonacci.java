package logical;

import java.util.Scanner;

public class Fabbonacci {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Value");
	int   value=	scanner.nextInt();
	int f1=0,f2=1,f3,count=0;
	System.out.println(f1);
	System.out.println(f2);
	count=2;
	while(count<value)
	{
		f3=f1+f2;
		System.out.println(f3);
		count++;
		f1=f2;
		f2=f3;
		
	}
	
	
	
	}
}
