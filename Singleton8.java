public class Singleton8
{
	public static void main(String[] args)
	{
		ClassBoard sing = ClassBoard.singleton();
		ClassBoard song = ClassBoard.singleton();
		System.out.println(sing == song);
	}
}

class ClassBoard
{
	private static final ClassBoard class_board = new ClassBoard();
	private ClassBoard()
	{
	
	}
	public static final ClassBoard singleton()
	{
		return class_board;
	}
}
