package day15;
class Plane{
	
}
class CargoPlane extends Plane{
	
}
class Parent{
	public Plane func()
	{
		System.out.println("Overriden method");
		Plane p=new Plane();
		return p;
	}
}
class Child extends Parent {
	public CargoPlane func()
	{
		System.out.println("Override child method");
		CargoPlane cp=new CargoPlane();
		return cp;
	}
}

public class Example1 {

	public static void main(String[] args) {
		Child c=new Child();
		c.func();

	}

}
