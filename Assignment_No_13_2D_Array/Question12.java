// 12. Write a Java program to find the frequency of a given element in a matrix.

import java.util.Scanner;

class Question12
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	int arr[][] = {{5,9,4},{8,3,6},{7,4,2},{5,9,4},{8,3,6},{7,4,2}};
	
	System.out.println("Enter the element you want to get frequency :");
	int fre = sc.nextInt();

	int count = 0;
	for (int i=0;i<arr.length;i++)
	{
		for (int j=0;j<arr[i].length;j++)		
		{
			if (fre == arr[i][j])
			{
				count++;	
			}	
		}
		
	}
	
	System.out.println("The frequency of elements "+fre+" is count : "+count);

	}
}