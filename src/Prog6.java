
public class Prog6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int array[]={80,30,100,50,60,10,40};
		
		int largest =array[0];
		
		int secondlargest=array[0];
		// TODO Auto-generated method stub
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>largest)
			{
				secondlargest=largest;
				
				largest=array[i];
				
			}
			else if(array[i]>secondlargest)
			{
				secondlargest=array[i];
				
			}
			
		}
		System.out.println("Second largest No is"+secondlargest);
	}

}
