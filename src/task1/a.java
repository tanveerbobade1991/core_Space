package task1;

public class a {
	package task1;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.lang.*;
	import java.util.Scanner; 

	public class Mainmenu {
		

	 public static void main(String [] args)
	 { int a = 0;
	 
	 String name = null;

	 
		 System.out.println("Select Bank Name");
		
		 
		 System.out.println();
		 System.out.println("select 1 for ICICI");
		 System.out.println();
		 System.out.println("select 2 for SBI");
			// TODO Auto-generated method stub\
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		try {
			name=br.readLine();
			String a1=name;
			}
			catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 if(name=="ICICI")
			 {System.out.println("Welcome to ICICI Bank");
		    		
		    		String ICICI = null;
					try {
						ICICI = br.readLine();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		    		try {
						Class b=Class.forName(ICICI);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 }
		      
		    		else if(name=="SBI")
		    			{System.out.println("Welcome to SBI Bank");
		
		    			}
		    		else
		    		{	System.out.println("Enter the valid choice");
		    		}
		 }
		 
		    
		    
		    
		 } 	
		       
		 
	 




}
