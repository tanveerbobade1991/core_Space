package task2;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.InputStreamReader; 
	import java.util.Scanner;

	public class Mainmenu {
		

	 public static void main(String [] args)
	 { int i = 1;
	 
	   System.out.println("Enter Bank name");
		  
	 
		   System.out.println("Enter for (task2.ICICI)  for ICICI Bank"); 
		   System.out.println("Enter for (task2.SBI Bank)  for SBI Bank");
		   
		   
			
			// TODO Auto-generated method stub\
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		InputStreamReader(System.in);
		
		String bankname=null;
		try {
			bankname = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		BankAbstract b=null;
		
		
			try {
				b=(BankAbstract) Class.forName(bankname).newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(Exception e){
				
				
				
			}
			
				
				while(i!=0){
			System.out.println("Main Menu");
			 System.out.println("Press 1 for Deposit");
			 System.out.println("Press 2 for Withdraw");
			 System.out.println("Press 3 for Balance Enquiry");
			 System.out.println("Press 4 for EXIT");Scanner sc=new Scanner(System.in);  
			 int choice=sc.nextInt();  
			 
			
			
			if(choice==1)
			{
				b.deposit();
				
			}
			
			else if(choice==2){
				b.withdraw();
				}
			else if (choice==3)
			{
				b.Showbalance();
			}
			else if(choice==4)
			{
				System.out.println("You are exit");
				i=0;
				
				
			}
			else
			{
				System.out.println("Enter the valid Choice");
			}
		
			
	 }	    
		 
		
	 }
	

	private static void InputStreamReader(InputStream in) {
		// TODO Auto-generated method stub
		
	} 	

	}




