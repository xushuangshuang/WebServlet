public class BubbleSort
{
	public static void bubbleSort(int[] sort)
	{
		for(int i = 0; i < sort.length -1; i++)
		{
			for(int j = 0; j < sort.length - i -1; j++)
			{
				if(sort[j] > sort[j + 1])
				{
					int temp = sort[j + 1];
					sort[j + 1] = sort[j];
			       		sort[j]	= temp;       
				}
			}
			
		
		}
			for(int k = 0; k < sort.length; k++)
			{
				System.out.println(sort[k]);
			}
		
	}

	public static void main(String[] args)
	{
		int[] ch = {1, 2, 4, 3};
		bubbleSort(ch);
	}
}
