package day19;

import java.util.Scanner;

//To Store the age of student of 2 classroom where the the first classroom has 2 student
//second has 5 student
public class JaggedArray {

	public static void main(String[] args) {
		int age[][] = new int[2][5];
		//When not sure about how many students are in each class, just leave blank
		//Specify Seperatly
		age[0] = new int[2];
		age[1] = new int[5];
		
		Scanner scan =new Scanner(System.in);
		for(int i=0; i<=age.length-1; i++)//classroom
		{
			for(int j=0;j<=age[i].length-1;j++)
			{
				System.out.println("Enter the age of Class" + i +"Student" + j);
				age[i][j] = scan.nextInt();
			}
		}
		System.out.println("the Age are: ");
		for(int i = 0; i<=age.length; i++)
		{
			for(int j=0; j<=age[i].length-1; j++)
				
			{
				System.out.println(age[i][j]);
				
			}
		}

	}

}
