package day2;

import java.util.Scanner;

public class MarksValuation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);// Scan the input
		System.out.println("Enter the marks:");
		int num=sc.nextInt();//marks to be entered
		if(num<=100 && num>=81)
		{
			System.out.println("Distinction"); // Distinction-num is in between 81 and 100
		}
		else if(num<=80 && num>=35)
		{
			System.out.println("First Class");// First Class-num is in between 35 and 80
		}
		else if(num>100 || num<0)
		{
			System.out.println("pelease give a correct input");// incorrect value-num is in should be between 0 and 100
		}
		else
		{
			System.out.println("Fail");// Fail-num is in between 0 and 35
		}

	}

}
