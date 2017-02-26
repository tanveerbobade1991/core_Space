package task6;

import java.util.Scanner;

public class Jip {

	
	public static void main(String[]args) 
	
	{
	
	Scanner sc=new Scanner(System.in);
	
	String input=sc.nextLine();
	
	System.out.println(input);
		
	int length=input.length();
	System.out.println(length);
	 
	char a=input.charAt(0);
	
	 char b=Character.toUpperCase(a);
	 
	System.out.print(b);
	
	 
	 
	 String s="";
	// String 
	for(int i=1;i<=length-1;i++)
	{
		char c=input.charAt(i);
		
		if(c==' ')
		{
			s=s+' ';
			//System.out.println(s);
			char d=input.charAt(i+1);
			
			d=Character.toUpperCase(d);
			
			s=s+d;
			i++;
			
			
		}
		
		else
			
			s=s+input.charAt(i);
		
	}
	System.out.print(s);
	}

}
