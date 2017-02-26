
public class Prog7 

	{
public static void main(String[] args) {
		
		
		int array[]={20,30,100,50,60,10,40,5};
		
		int smallest =array[0];
		
		int secondsmallest=array[0];
		// TODO Auto-generated method stub
		for(int i=1;i<array.length;i++)
		{
			if(array[i]<smallest)
			{
				secondsmallest=smallest;
				
				smallest=array[i];
				
			}
			else if(array[i]>secondsmallest)
			{
				secondsmallest=array[i];
				
			}
			
		}
		System.out.println("Second smallest No is"+secondsmallest);
	}

	}