import java.lang.reflect.Array;

public class ReflectArray
{
	public static void main(String[] args)
	{
		int[] adm = new int[]{5, 7, 10};
		//下面这个方法是建立一个3维的数组，adm 这个数组是用来给array设置维度的
		Object array = Array.newInstance(Integer.TYPE, adm);
		//obj1 是取得array数组中index为3的一列数组，此处可以想象成3维立体结构，此处的index就是一个平面了，而不是立体的了，所以他是一个二维数组
		Object obj1 = Array.get(array, 3);
		//上面说了可以想象成一个2维数组，下来我们继续给这个2维数组取得一个index，就下来就是一个1维数组了
		obj1 = Array.get(obj1, 4);
		//下来就可以准确定位了，因为是维数组，我们需要3个坐标既可以定位一个点，所以下来这个就是给array[3][4][5]这个点赋值了
		Array.setInt(obj1, 5, 10);
		//因为我们上面的数组是个动态的数组，只是定义了一个3维的数组，这句是把动态数组强制转换成静态的数组
		int[][][] arrayCast = (int[][][]) array;
		//使用静态的数组进行打印即可
		System.out.println(arrayCast[3][4][5]);

	}

}
