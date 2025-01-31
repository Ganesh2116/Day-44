// 2. Write a Java program to multiply two matrices.


class Question02
{
	public static void main(String[] arge)
	{
	int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
	int arr2[][] = {{10,20,30},{40,50,60},{70,80,90}};
	
	
	System.out.println("Multiply two matrices is:");
	for (int i=0;i<arr1.length;i++)
	{
		for (int j=0;j<arr2.length;j++)
		{	
			System.out.print((arr1[i][j]*arr2[i][j])+" ");
		}
	}
	}
}