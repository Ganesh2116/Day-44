// 14. Write a Java program to perform scalar multiplication on a matrix.

import java.util.Scanner;


class Question14
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
	
	System.out.println("Enter the scalar element here:");
	int scalar = sc.nextInt();
	
	System.out.println("matrix is:");
	for (int i=0;i<arr.length;i++)
	{
		for (int j=0;j<arr.length;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}

	System.out.println("Scalar multiplication now array is:");
	for (int i=0;i<arr.length;i++)
	{
		for (int j=0;j<arr.length;j++)
		{
			arr[i][j]=arr[i][j]*scalar;
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
	}
}