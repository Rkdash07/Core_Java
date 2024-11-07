package day7;
class Addition{
	int c;
	int add(int x,int y)
	{
		c=x+y;
		return c;
	}
}
public class Demo {

	public static void main(String[] args) {
		Addition ref=new Addition();
		int a=20;
		int b=30;
		int res=ref.add(a, b);
		System.out.println(res);

	}

}
