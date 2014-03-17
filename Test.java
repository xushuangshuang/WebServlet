import java.util.HashMap;
import java.util.Random;
import java.util.Iterator;

public class Test
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		Random random = new Random();
		for(int i = 0; i < 40; i++)
		{
			map.put(i, random.nextInt(40) + 10);
		}
		System.out.println(map);
		for(Iterator ite = map.iterator();ite.hasNext();)
		{
			String key = (String)ite.next();
			for(int j = 0; j < map.size(); j++)
			{
				String value = ite.get(j);
				if()
			}
			
		}


	}
}
