package day14;

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
class Airport{
	void permit(Plane ref)
	{
		ref.takeoff();
		ref.land();
		ref.fly();
	}
}
public class Polymor {

	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		PassangerPlane pp=new PassangerPlane();
		FighterPlane fp=new FighterPlane();
		Airport a=new Airport();
		a.permit(fp);
		a.permit(pp);
		a.permit(cp);
		
		

	}

}