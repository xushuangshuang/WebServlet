import java.util.Random;

public class RandomTest2
{
	public static void main(String[] args)
	{
		Random random = new Random();
		int[] a = new int[50];
		
		for(int i = 0; i < 50; i++)
		{
			a[i] = random.nextInt(50);
		}
		
		quickSort(a, 0, a.length - 1);
		searchMiddle(a );

		
		for(int c = 0; c < a.length; c++)
		{
			System.out.print(a[c] + "   ");
		}
	}

	public static void quickSort(int[] sort, int start, int end)
	{
		if(start < end)
		{
			int key = sort[end];
			int i = start - 1;
			for(int j = start; j < end; j++)
			{
				if(sort[j] <= key)
				{
					i++;
					int temp = sort[i];
					sort[i] = sort[j];
					sort[j] = temp;
				}
			}

			sort[end] = sort[i + 1];
		       	sort[i + 1] = key;
	       		quickSort(sort, start, i);
	 		quickSort(sort, i + 1, end);		
		}	
	}

	public static void searchMiddle(int[] middle )
	{
		int low = 0;
		int high = middle.length - 1;
		
		for(int i = 0; i < middle.length; i++)
		{
			while(low < high)
			{
				if(middle[i] == middle[(low + high) / 2])
				{
					System.out.print(middle[i] + "  " + i + "  " );
				}
				if(middle[i] < middle[(low + high) / 2])
				{
					high = (low + high)/2;
				}
				if(middle[(low + high) / 2] < middle[i])
				{
					low =  (low + high)/2;
				}
			}
		}
	}
}
