package logical;

import java.util.Scanner;



public class Armstrong {

	public static void main(String[] args) {
		Scanner scanner =new  Scanner(System.in); 
		System.out.println("Enter number");
		int value=scanner.nextInt();
		int tempvalue=value;
		int i=0;int sum=0;
		while(value>0)
		{
			i=value%10;
			sum=sum+(i*i*i);
			value=value/10;

		}
		if(sum==tempvalue){
		System.out.println("sum is "+sum);
		System.out.println(" Armstrong");
		}
		else 
			System.out.println("Not a Armstrong");
		}
}
