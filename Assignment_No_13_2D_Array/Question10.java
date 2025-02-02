// 10. Write a Java program to find the minimum element in a matrix.


class Question10
{
	public static void main(String[] arge)
	{
	int arr[][] = {{12,22,55},{33,66,99},{88,77,10}};
	
	int min= arr[0][0];
	for (int i=0;i<arr.length;i++)
	{
		for (int j=0;j<arr.length;j++)
		{
			if (arr[i][j]<min)
			{
				min = arr[i][j];
			}
		}
	}
		
	System.out.println("Minimum element in matrix is:"+min);

	}
}