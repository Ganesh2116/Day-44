// 13. Write a Java program to rotate a matrix by 90 degrees clockwise.

class Question13
{
	public static void main(String[] arge)
	{	
	int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
	
	int arrc[][] = new int[arr.length][arr.length];

	System.out.println("Matrix is:");
	for (int i=0;i<arr.length;i++)
	{
		for (int j=0;j<arr.length;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	

	//transpose
	for (int i=0;i<arr.length;i++)
	{
		for (int j=0;j<arr.length;j++)
		{
			arrc[i][j] = arr[j][i];
		}
	}
	
	//revsred order
	for (int i=0;i<arrc.length;i++)
	{
		for (int j=0;j<arrc.length;j++)
		{
			for (int k=0;k<arrc.length;k++)
			{	
				int temp = arrc[i][k];
				arrc[i][k] = arrc[i][j];
				arrc[i][j] = temp;
			}
				
		}
	}


	System.out.println("90 degree clockwise Matrix is:");
	for (int i=0;i<arrc.length;i++)
	{
		for (int j=0;j<arrc.length;j++)
		{
			System.out.print(arrc[i][j]+" ");
		}
		System.out.println();
	}
	}
}