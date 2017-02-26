package logical;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
	String original=	scanner.next();
	String reverse="";
		for(int i=original.length()-1;i>=0;i--)
		{
			
			 reverse = reverse+original.charAt(i);
		
			
		}
		if(reverse.equals(original))
		{
	
		 System.out.println("Palindrome");
		}
		else 
			System.out.println("Not Palindrome");
	}
}
