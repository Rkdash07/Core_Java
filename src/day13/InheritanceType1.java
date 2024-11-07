package day13;
class Plane
{
	void takeoff()
	{
		System.out.println("Plane is Taking Off");
	}
	void fly()
	{
		System.out.println("Plane is flying");
	}
	void land()
	{
		System.out.println("Plane is Landing");
	}
}
class CargoPlane extends Plane
{
	void fly()//Overriden method
	{
		System.out.println("Plane is flying at low Height");
	}
}
class PassangerPlane extends Plane
{
	void fly()//Overriden Methods
	{
		System.out.println("Plane is flying at medium height");
	}
}
class FighterPlane extends Plane
{
	void fly()//Overriden Methods
	{
		System.out.println("Plane is flying at top height");
	}
	
}
public class InheritanceType1 {

	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		PassangerPlane pp=new PassangerPlane();
		FighterPlane fp=new FighterPlane();
		cp.takeoff();
		cp.fly();
		cp.land();
		pp.takeoff();
		pp.fly();
		pp.land();
		fp.takeoff();
		fp.fly();
		fp.land();
		
		

	}

}
