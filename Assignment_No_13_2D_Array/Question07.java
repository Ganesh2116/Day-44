// 7. Write a Java program to find the product of diagonal elements of a matrix.


class Question07
{
	public static void main(String[] arge)
	{
	int arr1[][] = {{1,0,0},{0,2,0},{0,0,3}};
	
	int pro = 1;
	
	for (int i=0;i<arr1.length;i++)
	{
		for (int j=0;j<arr1.length;j++)
		{	
			if (i == j)
			{
				pro = pro * arr1[i][j];
			}	
		}
	}
	
	System.out.println("Product of diagonal elements is : "+pro);

	}

}