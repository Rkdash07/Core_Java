package day19;

import java.util.Scanner;

public class ArrayImplement {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println("Enter the age: ");
			a[i] = s.nextInt();
		}
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i]);
			
		}
	}

}
