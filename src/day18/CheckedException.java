package day18;

public class CheckedException {
	static void display()throws Exception {
	for(int i=0 ; i<=5 ; i++)
	{
		System.out.println(i);
		Thread.sleep(2000); //this handled by the throwable
		
	}
}
	public static void main(String[] args) throws InterruptedException {
		try {
			display();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}