package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Compare {

	/*private static String string1;*/

	public static void main(String[] args) {
		
		
		System.out.println("Enter the  String or Number");
		// TODO Auto-generated method stub
		BufferedReader str=new BufferedReader (new InputStreamReader(System.in));
		
		String string2=null;
		String string1=null;
		try {
			 string1=str.readLine();
						 
			 System.out.println("Enter the  String or Number");
			  string2=str.readLine();
				
			  	int	x =Integer.parseInt(string1);
				int x1 =Integer.parseInt(string2);
				
				int add=x1+x;
				System.out.println("Addition"+add);
			
		} catch (IOException e) {
		
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("Concat="+string1+string2);
			
		}	
	
	}
}
