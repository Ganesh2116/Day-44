// 1. Write a Java program to add two matrices of the same size.

class Question01
{
	public static void main(String[] arge)
	{
	int a[][] ={{10,20,30},{11,22,33},{12,22,32}};
	int b[][] ={{40,50,60},{44,55,66},{42,43,44}};
	
	
	System.out.println("Additon of 2d array is :");
	for (int i=0;i<a.length;i++)
	{
		for (int j=0;j<a.length;j++)
		{
			System.out.print(a[i][j]+b[i][j]+" ");
		}
	}
	
	
	}
}