import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class Map
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		for(int i = 0; i < args.length; i++)
		{
			if(map.get(args[i] == null))
			{
				map.put(args[i], new Integer(1));
			}
			else
			{
				Integer in = (Interger)map.get(args[i]);
				in = new Integer(in.value() + 1);

				map.put(args[i], in);
			}
		}

		Set set = map.KeySet();
		for(Iterator ite = set.iterator(); ite.hasNext();)
		{
			String key = (String)ite.next();
			Integer value = (Iteger)map.get(key);
			System.out.println(key + " : "+ value);

		}
	}
}
