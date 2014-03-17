public class QuickSortTest6
{
	public static void quickSortTest(int[] sort, int start, int end)
	{
		if(start < end)
		{
			int key = sort[end];
			int i = start - 1;
			for(int j = start; j < end; j++)
			{
				if(sort[j] <= sort[end])
				{
					i++;
					int temp = sort[i];
					sort[i] = sort[j];
					sort[j] = temp;
				}
			}

			sort [end] = sort[i + 1];
			sort[i + 1] = key;
			quickSortTest(sort, i +1, end);
			quickSortTest(sort, start, i);
		}
	}

	public static void main(String[] args)
	{
		int[] ch = {1, 4, 3, 5, 7};
		quickSortTest(ch , 0, ch.length - 1);
		for(int c = 0; c < ch.length; c++)
		{
			System.out.println(ch[c]);
		}
	}

}


