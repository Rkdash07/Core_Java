package day12;


class Test1 extends Object
{
	int x,y;
	{
		x=100;
		y=200;
	}
	
    Test1(int x,int y)
    {
    	this.x=x;
    	this.y=y;
    }
	
}
class Test2 extends Test1
{
	int a,b;
	Test2(int a,int b)
	{
		super(a,b);
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

public class Example_Inheritance1 {

	public static void main(String[] args) {
		Test2 t=new Test2(20,30);
		t.display();

	}

}
