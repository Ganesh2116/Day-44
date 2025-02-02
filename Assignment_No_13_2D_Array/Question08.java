//8. Write a Java program to find the sum of each row and column of a matrix.

class Question08
{
	public static void main(String[] arge)
	{
	int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
	
	for (int i=0;i<arr1.length;i++)
	{
		int sum = 0;
		int colsum = 0;
		for (int j=0;j<arr1.length;j++)
		{	
			sum = sum + arr1[i][j];
			colsum = colsum + arr1[j][i];	
		}
		System.out.println("Row number "+(i+1)+" and sum is:"+sum);
		System.out.println("Col number "+(i+1)+" and sum is:"+colsum);
	}
	}

}