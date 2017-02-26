package student;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Studentdata s=new Studentdata();
		
		// TODO Auto-generated method stub
		s.setRollNo(1);
		s.setName("Tanveer");
		Addr a=new Addr();
		a.setArea("Warje");
		a.setCity("Pune");
		s.setAd(a);//set the data in class Addr
		
		Studentdata s1=new Studentdata();
		s1.setName("Aditya");
		s1.setRollNo(2);
		s1.setAd(a);
		s.getAd().getArea();//get data in the class 
		s.getAd().getCity();
		Addr a1=s.getAd();//keeping same address with same memory using less memory
		System.out.println(s.getRollNo());
		System.out.println(s.getName());
		System.out.println(s.getAd().getArea());
		System.out.println(s.getAd().getCity());
		System.out.println(s1.getRollNo());
		System.out.println(s1.getName());
		System.out.println(s.getAd().getArea());
		System.out.println(s.getAd().getCity());
		
		
	}

}
 