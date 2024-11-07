package day13;

class Object
{
	Object()
	{
		
	}
}
class Test extends Object{
	int x,y;
	Test()
	{
		x=100;
		y=200;
	}
	Test(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}
class Test0 extends Test
{
	int a,b;
	Test0()
	{
		a=300;
		b=400;
	}
	Test0(int a,int b)
	{
		super(a,b);   // output of the parent is effected
		this.a=a;
		this.b=b;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
}

}

public class Construct {

	public static void main(String[] args) {
		Test0 t=new Test0(9,99);
		t.display();

	}

}
