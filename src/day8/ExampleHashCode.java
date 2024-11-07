package day8;

public class ExampleHashCode {
	public int hashCode()
	{
		return 12345;
	}
      
	public static void main(String[] args) {
		ExampleHashCode e=new ExampleHashCode();
		System.out.println(e);//calling the implicitly
		System.out.println(e.hashCode());
		

	}

	}


