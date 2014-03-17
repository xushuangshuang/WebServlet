public class DichotomyTest
{
	public static  boolean dichotomyTest(int[] dichotomy,int b)
	{
		for(int i = 0; i < dichotomy.length -1; i++)
		{
			for(int j = 0; j < dichotomy.length - i -1; j++)
			{
				if(dichotomy[j] > dichotomy[j + 1])
				{
					int temp = dichotomy[j];
					dichotomy[j] = dichotomy[j + 1];
					dichotomy[j + 1] = temp;
				}
			}
		}
		int low = 0;
		int high = dichotomy.length;
		int middle = 0;
		while(low < high)
		{
			middle = (low + high)/2;
			if(b == dichotomy[middle])
			{
				return true;
			}
			if(b > dichotomy[middle])
			{
				low = middle ;
			}
			if(b < dichotomy[middle])
			{
				high = middle;
			}
		}
		return false;
	}

	public static void main(String[] args)
	{
		int a = 3;
		int[] ch = {1, 2, 3, 7, 5};
		System.out.println(dichotomyTest(ch, a));
	}
}
