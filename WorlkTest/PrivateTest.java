package com.bodejidi;
import java.lang.Class;
import java.lang.reflect.Method;
public class PrivateTest
{
	public static void main(String[] args)
	{
		Class <?> c = Class.forName("com.bodejidi.Private2");

		Private2  priv = c.newInstance();

		
		Method method = c.getDeclareMethods("getName",{});

		String str = (String)method.invoke(priv,{});
	}
}
