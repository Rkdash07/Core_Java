package day17;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=scan.nextInt();
		System.out.println("Enter the first number: ");
		int b=scan.nextInt();
       try
       {
		System.out.println(a/b);
       }
       catch(ArithmeticException e)
       {
    	   System.out.println("Division by 0 not allowed");
       }

	}

}
