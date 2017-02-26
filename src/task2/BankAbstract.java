package task2;

import java.util.Scanner;

public class BankAbstract implements Bank {

		static int amount=0;

		static int amt=10000;


		
		public void withdraw()
		{
			
			Scanner sc=new Scanner(System.in);  
		    
			 System.out.println("Enter the amount to Withdraw"); 
				
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
		public void Showbalance() {
			// TODO Auto-generated method stub
			
		}
		public void deposit() 
			{
				
				Scanner sc=new Scanner(System.in);  
			    
				   System.out.println("Enter the amount to deposit"); 
					
				     int amount=sc.nextInt();  
					
				     amt=amt+amount;
				     
				     System.out.println(amount+" Rs Amount Deposited");
				     System.out.println("Your account's current balance Rs"+amt);
				     System.out.println("Thanx for Banking with us");
				
			// TODO Auto-generated method stub
			
		}

	}


