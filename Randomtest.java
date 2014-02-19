import java.util.Random;

public class Randomtest
{
	public static void main(String[] args)
	{
		Random random = new Random();
		int result = random.nextInt(16) + 1;
		System.out.println(result);
	}

}
