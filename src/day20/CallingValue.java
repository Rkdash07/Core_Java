package day20;
class Car
{
	String name;
	float mileage;
	int cost;
}
public class CallingValue {
	
	public static void main(String args[])
	{
		Car c = new Car();
		c.name = "BMW";
		c.mileage = 5.5f;
		c.cost = 75;
		System.out.println(c.name);
		System.out.println(c.mileage);
		System.out.println(c.cost);
		
		Car b;
		b = c;
		System.out.println(b.name);
		System.out.println(b.mileage);
		System.out.println(b.cost);
		System.out.println("========================");
		System.out.println(c.name);
		System.out.println(c.mileage);
		System.out.println(c.cost);
		System.out.println("========================");
		b.name = "TATA";
		b.cost = 13;
		b.mileage = 15.5f;
		
		System.out.println(b.name);
		System.out.println(b.mileage);
		System.out.println(b.cost);
		System.out.println("========================");
		System.out.println(c.name);
		System.out.println(c.mileage);
		System.out.println(c.cost);
		System.out.println("========================");
		
		
				
		
	}

}
