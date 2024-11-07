package day12;

class CreditCard{
	int CardNo=10290;
	int Pin=1234;
}
class Hacker extends CreditCard{
	void ViewDetail()
	{
		System.out.println("Card Number:"+CardNo);
		System.out.println("pin no:"+Pin);
	}
	void changeDetail()
	{
		int CardNo=20290;
		int Pin=4321;
		System.out.println(CardNo);
		System.out.println(Pin);
	}
	
}

public class Example_Inheritance {

	public static void main(String[] args) {
		Hacker h=new Hacker();
		h.changeDetail();
		}
	
	

}
