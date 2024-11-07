package day9;

public class Swapping {

	public static void main(String[] args) {
		int x = 8;
        int y = 9;  
        System.out.println("before swapping numbers: "+x +" "+ y);
       x=x+y;
       y=x-y;
       x=x-y;
        System.out.println("After swapping: "+x +"  " + y);   

	}

}
