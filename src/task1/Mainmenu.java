package task1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader; 
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.GOTO;

public class Mainmenu {
	

 public static void main(String [] args)
 { String name = null;

 
   System.out.println("Enter Bank name");
	  
 
	   System.out.println("Enter for (task1.ICICI)  for ICICI Bank"); 
	   System.out.println("Enter for (task1.SBI Bank)  for SBI Bank");
	   
	   
		
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
	try {
		Bank b=(Bank) Class.forName(bankname).newInstance();
		 System.out.println("Main Menu");
		 System.out.println("Press 1 for Deposit");
		 System.out.println("Press 2 for Withdraw");
		 System.out.println("Press 3 for EXIT");Scanner sc=new Scanner(System.in);  
		 int choice=sc.nextInt();  
		 
		
		
		if(choice==1)
		{
			b.deposit();
			
		}
		
		else if(choice==2){
			b.withdraw();
			}
		else
		{
			System.out.println("");
		}
		
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
					    
	 
	
}

private static void InputStreamReader(InputStream in) {
	// TODO Auto-generated method stub
	
} 	

}


