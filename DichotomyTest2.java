public class DichotomyTest2
{
	public static void dichotomy(int[] src)
	{
		for(int i = 0; i < src.length; i++)
		{
			for(int j = 0; j < src.length; j++)
			{
	
		while(i != j)
		{
			 i = 0;
			 j = 0;
			int a = src[src.length - 1];
			while(src[j] > a)
			{
				j++;
			
				if(src[j] <= a)
				{
					src[i++] = src[j];
				}
			}
		}
		for(int k = 0; k< src.length; k++)
		{
		System.out.println(src[k]);
		}
		}
	}
	}
	public static void main(String[] args)
	{
		int[] ch = {1, 3, 5, 2, 8, 6};
		dichotomy(ch);
	}
}
