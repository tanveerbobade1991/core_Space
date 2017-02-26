package task4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.Scanner;
  
 class Account implements serializable
 {
		
int Acc_no;
String Account_holder;
long Mob_no;
String E_id;
String Add;
long Bal;
void m1(){
	System.out.println("Enter the Account no"); 
	BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	Scanner sc =new Scanner(System.in);
	try {
		Acc_no=sc.nextInt();
		System.out.println("Account No="+Acc_no);
	
	

		System.out.println("Enter the Account Holder name"); 
		Account_holder=br.readLine();
		System.out.println("Name is="+Account_holder); 
		
		System.out.println("Enter the Mobile number"); 
		Mob_no=sc.nextLong();
		System.out.println("Mobile no is="+Mob_no); 
		
		
		System.out.println("Enter the Email _ID of Account Holder "); 
		Account_holder=br.readLine();
		System.out.println("Email ID is  "+Account_holder); 
		
		System.out.println("Enter the Address of Account Holder "); 
		Add=br.readLine();
		System.out.println("Address is=  "+Add); 
		
		System.out.println("Enter the Balance "); 
		Bal=sc.nextLong();
		System.out.println("The balance is "+Bal); 
	
	}
	
	catch(IOException e)
	{
		
	}
	
}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{ 
		int i=1;
	
		try {
		
			while( i!=0)
	
			{
				Account a=new Account();
		
				System.out.println("Enter the name operation");
				System.out.println("Press 1 for Add Account");
				System.out.println("Press 2 for Find Account ");
				System.out.println("Press 3 for Exit");
				Scanner sc =new Scanner(System.in);
				int choice =sc.nextInt();
				
		
        
				if(choice==1)
				{
					a.m1();
					FileInputStream fileIn;
					fileIn = new FileInputStream("D:Account.ser");
					ObjectInputStream in = new ObjectInputStream(fileIn);
					a = (Account)in.readObject();
					in.close();
					fileIn.close();
					System.out.printf("Serialized data is saved in /tmp/employee.ser");
				}
					else if(choice==2)
					{
			s
				
					}
						else
						{
							System.out.println("You are out of the system");
							i=0;
						}
			}
		}
		catch (FileNotFoundException e) 
		{
		
			e.printStackTrace();
		}
		
	
	}
 
}