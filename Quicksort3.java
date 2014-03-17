public class Quicksort3
{
	public static void quickSort(int[] sort , int from, int to)
	{
		if (from < to)
       		{ 
           		int temp = sort[to]; 
            		int i = from - 1; 
           	 	for (int j = from; j < to; j++)
	   	 	{ 
               			 if (sort[j] <= temp)
	     			 { 
                   			i++; 
                   		 	int tempValue = sort[j]; 
                   		 	sort[j] = sort[i]; 
                   		 	sort[i] = tempValue; 
               			 } 
          		  } 
           		sort[to] = sort[i+1]; 
            		sort[i+1] = temp; 
           		quickSort(sort, from, i); 
            		quickSort(sort, i + 1, to); 
       		 } 
	}

	public static void main(String[] args)
	{
		int[] src = {1, 3, 2, 7, 6, 5};
		quickSort(src, 0, 5);
		for(int c = 0; c < src.length; c++)
		{
			System.out.println(src[c]);
		}
	}
}
