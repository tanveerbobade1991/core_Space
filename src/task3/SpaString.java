package task3;


import java.util.Scanner;

public class SpaString {
	
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String eg:\'Hello World\'");
		String input=s.nextLine();
		int length=input.length();
		System.out.println(length);
		System.out.println();
		String str="";
		for(int i=0;i<=length-1;i++)
		{  char a=input.charAt(i);
			//System.out.println(a);
			if(a!=' ')
			{
				str=str+input.charAt(i);
				//System.out.println(str);
			
			}
			
		}
		System.out.println(str);
	}
	

}
