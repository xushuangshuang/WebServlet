import java.lang.reflect.Array;

public class SingleArray
{
	public static void main(String[] args)
	{
		//Integer.TYPE 可以表示出引用的基本类型
		Object obj = Array.newInstance(Integer.TYPE, 10);
		//查阅set的方法，即是在obj数组中的第5个元素赋值
		Array.set(obj, 5, 88);
		//因为上面是动态的数组，这里我们需要把动态的数组定义为静态的数组
		int[] array = (int[])obj; 
		System.out.println(array[5]);
	}
}
