package day2;

import java.util.Scanner;

public class evenOrOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Number giver in is even");
			
		}
		else
		{
			System.out.println("Number giver in is odd");
			
		}

	}

}
