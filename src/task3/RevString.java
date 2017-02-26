package task3;

import java.util.Scanner;

public class RevString {

	
	public static String input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);  
		 System.out.println("Enter The String");
	     input = sc.nextLine(); 
	     System.out.println(input);
	     int length=input.length();//to calculate the length
	     System.out.println(length);
	     String revstring="";
	     for(int i=length-1;i>=0;i--)
	     {
	     
	     
	      revstring =revstring+input.charAt(i);//This method returns the character 
	      										//located at the String's specified index.
	      										//The string indexes start from zero.
	     }
	     System.out.println(revstring);
	     
	    	 
	     }
	}

