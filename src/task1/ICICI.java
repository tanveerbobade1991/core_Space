package task1;

import java.util.Scanner;

public class ICICI implements Bank 

{	
	
	static int amount=0;

	static int amt=10000;

	public void deposit() 
	{
		System.out.println("Welcome to ICICI Bank ");
		
	Scanner sc=new Scanner(System.in);  
    
	   System.out.println("Enter the amount to deposit"); 
		
	     int amount=sc.nextInt();  
		
	     amt=amt+amount;
	     
	     System.out.println(amount+" Rs Amount Deposited");
	     System.out.println("Your account's current balance Rs"+amt);
	     System.out.println("Thanx for Banking with us");
	     
	}
	public void withdraw()
	{
		
		Scanner sc=new Scanner(System.in);  
	    
		 System.out.println("Enter the amount to withdraw"); 
			
		     int amount=sc.nextInt();  
		     if (amount>amt)
		     {
		    	 System.out.println("Thanx for Banking with us");
		     }
		     else
		    	 {amt=amt-amount;
		     System.out.println(amount+" Rs Amount Withdrwal from your account");
		     System.out.println("Your account's current balance Rs"+amt);
		     System.out.println("Thanx for Banking with us");
		    	 }
	}

}
