import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class MapTest
{
	public static void main(String[] args)
	{
		HashMap hashMap = new HashMap();
		hashMap.put("a", "zhangsan");
		hashMap.put("b", "wangwu");
		hashMap.put("c", "wangmazi");

		System.out.println(hashMap.get("a"));
		System.out.println(hashMap);

		//System.out.println(hashMap.keySet());
		Set set = hashMap.keySet();

		for(Iterator ite = set.iterator(); ite.hasNext();)
		{
			String key = (String)ite.next();
			String value = (String)hashMap.get(key);
			System.out.println(value);
		}
		System.out.println(hashMap.entrySet());
		System.out.println(hashMap.keySet());

		Set set1 = hashMap.entrySet();
		for(Iterator ite = set1.iterator(); ite.hasNext();)
		{
			Map.Entry  entry = (Map.Entry) ite.next();

			String key =  (String)entry.getKey();
			String value = (String)entry.getValue();
			System.out.println(key  + "   " + value);	
		}	
	}
}
















