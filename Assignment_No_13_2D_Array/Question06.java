// 6. Write a Java program to find the sum of the diagonal elements of a matrix.

class Question06
{
	public static void main(String[] arge)
	{
	int arr1[][] = {{1,0,0},{0,2,0},{0,0,3}};
	
	int sum = 0;
	
	for (int i=0;i<arr1.length;i++)
	{
		for (int j=0;j<arr1.length;j++)
		{	
			if (i == j)
			{
				sum = sum + arr1[i][j];
			}	
		}
	}
	
	System.out.println("Sum of diagonal elements : "+sum);

	}

}