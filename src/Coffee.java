import java.util.Scanner;


public class Coffee {

	static int cof=50;
	int input;
	
	void pay()
	{
		System.out.println("Please Pay 50 Rs for coffee");
		
		Scanner sc=new Scanner(System.in);
		 input=sc.nextInt();
		if (input<50)
		{
			System.out.println("Pay total 50 Rs");
		}

		
	}
	void remain()
	{
		int i=input-cof;
		if (input==50)
		{
		System.out.println("Your coffee ");
		}
		else if(input>=50)
		{
			System.out.println("Your coffee and "+i+"Rs");
		}
		else
			{System.out.println("you cant buy coffee for "+input);
			System.out.println("you need to pay "+i+" Rs more");
			}
		}
	void space()
	{
		System.out.println();
		System.out.println();
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Coffee c=new Coffee();
		while(true)
			{
			System.out.println("Welcome To NICE coffee shop");
			c.pay();
			c.remain();
			c.space();
			}
	}

}
