package day19;

import java.util.Scanner;

public class ArrayImplement1 {

	public static void main(String[] args) {
		int age[][] = new int [2][5];
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i<=age.length-1; i++)
		{
			for(int j=0; j<=age[i].length-1; j++)
				
			{
				System.out.println("Enter the age of Class" + i +"Student" + j);
				age[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i<=age.length; i++)
		{
			for(int j=0; j<=age[i].length-1; j++)
				
			{
				System.out.println(age[i][j]);
				
			}
		}

	}

}
