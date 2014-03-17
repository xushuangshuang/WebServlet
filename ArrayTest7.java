public class ArrayTest7
{
	public static void main(String[] args)
	{
		int[] array = {1, 2, 7, 5};
		arrayTest(array);	
	}

	public static void arrayTest(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				if(a[j] < a[i])
				{
					int b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}
		}

		for(int k = 0; k < a.length; k++)
		{
			System.out.print(a[k]);
		}
		
	}
}
