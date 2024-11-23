package day17;

public class Example2 {

	public static void main(String[] args) {
		int arr[]= {2,3,4};
		
		try {
		System.out.println(arr[1]);
		System.out.println(arr[99]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			
		}
	}

}
