
public class Prog3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] array = {9, 29, 34, 35};
			 int small = array[0];
		      for (int i = 1; i < array.length; i++)
		      
		      {
		         if (array[i] < small)
		        	 
		        	 small = array[i];
		      }
		      System.out.println("small no is " + small);
			}
		
		}


