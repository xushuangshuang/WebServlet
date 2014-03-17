public class Singleton3
{
	public static void main(String[] args)
	{
		int[] cd = {1, 2};
		Singleton.swap(cd);
		System.out.println(cd[0]);
	}

class Singleton
{
	public static void swap(int[] ch)
	{
		int temp = ch[0];
		ch[0] = ch[1];
		ch[1] = temp;
	}
}
