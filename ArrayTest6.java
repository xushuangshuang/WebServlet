public class ArrayTest6
{
	public static void main(String[] args)
	{
		int[] d = {1, 2};
		int[] r = {1, 2};
		System.out.println(swap(d, r));
	}

	public static boolean swap(int[] a, int[] b)
	{
		if(a.length != b.length)
		{
			return false;
		}
		if(a == null || b == null)
		{
			return false;
		}
		for(int i=0; i < a.length; i++)
		{
			if(a[i] != b[i])
			{
				return false;
			}
		}
		return true;
	}	

}
