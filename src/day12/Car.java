package day12;
import java.util.Scanner;

public class Car {
	private String make;
    private String model;
    private short year;
    private int price;
    
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public void displayCarDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Car Price: $" + price);
    }



	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		 
		        System.out.print("Enter the make of the car: ");
		        String make=a.nextLine();

		        System.out.print("Enter the model of the car: ");
		        String model = a.nextLine();

		        System.out.print("Enter the year of the car: ");
		        short year = a.nextShort();

		        System.out.print("Enter the price of the car: ");
		        int price = a.nextInt();

		        Car userCar = new Car(make, model, year, price);
		        userCar.displayCarDetails();

		        a.close();


	}

}
