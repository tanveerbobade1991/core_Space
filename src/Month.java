import java.util.Scanner;


public class Month {

	
	public static void main(String[] args) 
	{
		while(true)
			{
			System.out.println("Enter the Value");
			
			Scanner sc=new Scanner (System.in);
			
			int input = sc.nextInt();
		
				if (input>31)
				{	
			
					int output=input/31;
					int output1=input%31;
					System.out.println(output+" Month And "+output1+" Days");
				}
					else
					{
						System.out.println(input+"Days");
					}
			}
	}

}
