package day19;

public class BubbleSort {

	public void sort(int arr[])
	{
		for( int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-i-1;j++)
			{
				//if(arr[j]<arr[j+1])Descending Order
				if(arr[j]>arr[j+1])//Ascending Order
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
			
		}
		
	}
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		
		int arr[] = {90,80,34,22,67,89,32,11};
		
		bs.sort(arr);
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		
		
	}

}
