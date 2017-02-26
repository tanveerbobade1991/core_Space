//prime no or not
public class Prog5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=0;
		int k=0;
		
		int[] array = {9, 29, 34, 35,45,56 };
		 
	      for (int i = 0; i < array.length; i++)
	      
	      		{  p=array[i];
	    	  
	      			for(int j=2;j<p;j++)
	      				
	      			{
	    	  
	      				if(p%j==0)
	      				{
	      					System.out.println("No is not prime"+p);
	      					break;
	      				}
	      			}
	      		}
	      
	      	}
}


