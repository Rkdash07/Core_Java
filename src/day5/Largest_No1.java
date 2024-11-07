package day5;

public class Largest_No1 {

	public static void main(String[] args) {
		int n1=10;
		int n2=20;
		int n3=40;
		if(n1>n2 && n1>n3)
		{
			if(n1>n3)
			{
				System.out.println("N1 is greatest");
			}
			else if(n3>n1)
			{
				System.out.println("N3 is greatest");
			}
			else
			{
				System.out.println("N2 is greatest");
			}
		}
			
	}

}
