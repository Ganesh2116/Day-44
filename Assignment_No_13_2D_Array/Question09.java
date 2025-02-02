// 9. Write a Java program to find the maximum element in a matrix.


class Question09
{
	public static void main(String[] arge)
	{
	int arr[][] = {{11,22,55},{33,66,99},{88,77,10}};
	
	int max = arr[0][0];
	for (int i=0;i<arr.length;i++)
	{
		for (int j=0;j<arr.length;j++)
		{
			if (arr[i][j]>max)
			{
				max = arr[i][j];
			}
		}
	}
		
	System.out.println("Maximum element in matrix is:"+max);

	}
}