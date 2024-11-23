package day19;

import java.util.Scanner;

public class MultidimensionArray {

	public static void main(String[] args) {
		
		int age[][][]=new int[2][2][3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<=age.length-1;i++)
		{
			for(int j=0; j<=age[i].length-1; j++)
			{
				for(int k=0; k<=age[i][j].length-1; k++)
				{
					System.out.println("Enter the Student from school " + i +"classroom " + j + "student " + k);
					age[i][j][k] = sc.nextInt();
				}
			}
		}
		for(int i=0; i<=age.length-1;i++)
		{
			for(int j=0; j<=age[i].length-1; j++)
			{
				for(int k=0; k<=age[i][j].length-1; k++)
				{
					System.out.print(age[i][j][k]+ " ");
					
				}
				System.out.print("\n");
			}
		}
	}

}
