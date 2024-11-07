package day16;

import java.util.Scanner;

interface Calculator
{
	void add();
	void sub();
	
}
class MyCalculator1 implements Calculator
{
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		int a=20;
		int b=30;
		int c=a-b;
		System.out.println(c);
	}
}
class MyCalculator2 implements Calculator
{
	public void add()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two number");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two number");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a-b;
		System.out.println(c);
	}
}
class MyCalculator3 implements Calculator{
	public void add()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two number");
		int a=s.nextInt();
		int b=s.nextInt();
		if(b==0)
		{
			System.out.println("second number is zero");
		}
		else
		{
			int c = a + b;
			System.out.println(c);
		}
	}
	public void sub()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two number");
		int a=s.nextInt();
		int b=s.nextInt();
		if(b==0)
		{
			System.out.println("second number is zero");
		}
		else
		{
			int c = a - b;
			System.out.println(c);
		}
}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		MyCalculator1 m1 = new MyCalculator1();
		MyCalculator2 m2 = new MyCalculator2();
		MyCalculator3 m3 = new MyCalculator3();
		
		m1.add();
		System.out.println("======================");
		m1.sub();
		System.out.println("======================");
		m2.add();
		System.out.println("======================");
		m2.sub();
		System.out.println("======================");
		m3.add();
		System.out.println("======================");
		m3.sub();

	}

}
