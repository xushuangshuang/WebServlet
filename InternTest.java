public class InternTest
{
	public static void main(String[] args)
	{
		String str1 = "aaa";
		System.out.println(str1.intern());

		int b = 123;
		Integer a = new Integer(b);
		int c= a.intValue(a);
		System.out.println(c);
	}
}
