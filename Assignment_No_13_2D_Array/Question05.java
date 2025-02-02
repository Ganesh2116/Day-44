// 5. Write a Java program to check if a matrix is diagonal.

import java.util.Scanner;

class Question05
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the size of row here:");
	int row= sc.nextInt();
	
	System.out.print("Enter the size of col here:");
	int col= sc.nextInt();

	int arr[][] = new int[row][col];
	
	if (row == col)
	{
		
		System.out.println("Enter the elements of array here :");
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrix is :");
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		int count = 0;
		int diagonal = 0;
	
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length;j++)
			{
				if (arr[i][j] == 0 && i==j)
				{
					count++;
				}
				if (arr[i][j] !=0 && i!=j)
				{
					diagonal++;
				}
			}
		}
		

		if (count == 0 && diagonal == 0)
		{
			System.out.println("This matrix is diagonal.");
		}
		else 
		{
			System.out.println("This matrix is not diagonal.");
		}
		
	}
	else 
	{
		System.out.println("Row and col are not equal..");
	}
	
	
	}
}