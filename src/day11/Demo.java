package day11;

class Test
{
	static int a,b;
	static
	{
		System.out.println("The static block");
		a=10;
	    b=20;
	}
	static void fun()
	{
		System.out.println("The static method  block");
		a=24;
	}
	
}

public class Demo {

	public static void main(String[] args) {
		Test.fun();

	}

}
