import java.util.ArrayList;

public class ArrayListTest
{
	public static void main(String[] args)
	{
		ArrayList arrayListTest = new ArrayList();

		arrayListTest.add("Hello");
		arrayListTest.add("  benben");

		String dd = (String)arrayListTest.get(2);

		System.out.println(dd);
	}
}
