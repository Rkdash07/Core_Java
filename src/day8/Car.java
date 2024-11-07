package day8;



class CarDetail{
	private String name;
	private int mileage;
	private int cost;
	
	public void setData(String x,int y,int z)
	{
		name=x;
		mileage=y;
		cost=z;
	}
	public String getName()
	{
		return name;
	}
	public int getMileage()
	{
		return mileage;
	}
	public int getCost()
	{
		return cost;
	}
}
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         CarDetail  c=new CarDetail();
         c.setData("BMW",2000,2000000);
         System.out.println(c.getName());
         
	}

}
