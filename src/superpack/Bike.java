package superpack;

public class Bike extends vehicle {
	int speed= 100;
	
	void speed()
	{
		System.out.println("Speed of bike is "+speed);
		System.out.println("Speed of bike is"+super.speed);
		}

}
