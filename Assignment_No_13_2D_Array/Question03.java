// 3. Write a Java program to find the transpose of a matrix.

class Question03
{
	public static void main(String[] arge)
	{
	int arr[][] = {{10,20,30},{40,50,60},{70,80,90}};
	int arrt[][] = new int[arr.length][arr.length];

	System.out.println("Array is :");
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
			arrt[i][j] = arr[j][i];
		}
	}
	
	System.out.println("Transpose Array is :");
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