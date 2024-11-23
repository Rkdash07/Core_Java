package day21;
//Concept of Lock() by synchronized keyword
class Print implements Runnable{
	synchronized public void run()
	//public void run()
	{
		String name = Thread.currentThread().getName();
		
		System.out.println(name + "Start printing");
		for(int i=1; i<=3;i++)
		{
			System.out.println(name + "is printing");
			try
			{
				Thread.sleep(4000);
			}
			catch(Exception e)
			{
				System.out.println("Something wrong");
			}
			System.out.println(name + "complete printing");
		}
	}
}
public class Printer {

	public static void main(String[] args) throws InterruptedException{
		
		Print p = new Print()
;
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(p);
		t1.setName("Vanisha");
		t2.setName("Rupesh");
		t3.setName("Darshan");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
