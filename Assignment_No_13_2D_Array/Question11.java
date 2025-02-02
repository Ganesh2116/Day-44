// 11. Write a Java program to sort the elements of each row of a matrix.


class Question11
{
	public static void main(String[] arge)
	{
	int arr[][] = {{5,9,4},{8,3,6},{7,4,2}};

	System.out.println("Matrix is :");
	for (int i=0;i<arr.length;i++)
	{
		for (int j=0;j<arr.length;j++)
		{	
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
	for (int i=0;i<arr.length;i++)
	{
		for (int j=0;j<arr.length;j++)
		{
			for (int k=0;k<arr.length;k++)
			{	
				if (arr[i][j]<arr[i][k])
				{
					int temp = arr[i][j];
					arr[i][j] = arr[i][k];
					arr[i][k] = temp;
				}
			}
				
		}
	}
	
	
	System.out.println("Sorted row only in matrix:");
	for (int i=0;i<arr.length;i++)
	{
		for (int j=0;j<arr.length;j++)
		{	
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}

	}
}