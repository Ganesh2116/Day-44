// 4. Write a Java program to check if a matrix is symmetric.

class Question04
{
	public static void main(String[] arge)
	{
	int arr[][] = {{10,20,30},{20,30,40},{30,40,50}};
	int arrt[][] = new int[arr.length][arr.length];
	
	System.out.println("Martix is:");
	for (int i=0;i<arr.length;i++)
	{
		for (int j=0;j<arr.length;j++)
		{
			System.out.print(arr[i][j]+" ");
			arrt[i][j] = arr[j][i];
		}
		System.out.println();
	}

	int count = 0;

	for (int i=0;i<arrt.length;i++)
	{
		for (int j=0;j<arrt.length;j++)
		{
			if (arr[i][j] != arrt[i][j])
			{
				count++;
			}
		}
	}

	if (count >0)
	{
		System.out.println("This is Not Symmetric matrix..");
	}
	else 
	{
	System.out.println("This Symmetric matrix:");
	for (int i=0;i<arrt.length;i++)
	{
		for (int j=0;j<arrt.length;j++)
		{
			System.out.print(arrt[i][j]+" ");
		}
		System.out.println();
	}
	}
	

	}
}