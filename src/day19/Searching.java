package day19;

import java.util.Scanner;

public class Searching {
	
	public static void SearchElement(int arr[],int search)
	{
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i] == search)
			{
				System.out.println("Element found at index"+ i);
			}
		}
		

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter the elements");
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
         System.out.println("Enter elements to find");
         
         int searchkey = sc.nextInt();
         
         SearchElement(arr, searchkey);
         
	}

}
