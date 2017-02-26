import java.util.*;
public class classa {
public static void main(String[] args) {
	
	System.out.println("How many numbers you want to aadd");
	
	Scanner input=new Scanner(System.in);
	
	int num =input.nextInt();
	int array []=new int[num];
	
	System.out.println("enter the"+num+"numbers");
	
	for(int i =0;i<array.length;i++)
	{
		array[i]=input.nextInt();
		
	}
	
	for(int i =0;i<array.length;i++)
	{
		System.out.println(array[i]);
		
	}
	
	
	System.out.println("incr");
	
	int temp=array[0]+array[1];
	System.out.println(temp);
	
	System.out.println(++temp);
	
System.out.println("d-incr");
	
	int temp1=array[0]+array[1];
	System.out.println(temp1);
	
	System.out.println(--temp1);
	
	
	
	
	
	
}
}
