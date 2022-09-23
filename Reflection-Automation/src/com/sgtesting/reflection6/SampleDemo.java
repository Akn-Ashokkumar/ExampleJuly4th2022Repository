package com.sgtesting.reflection6;

import java.lang.reflect.Method;

public class SampleDemo {

	public static void main(String[] args) {
		executeMethods();

	}
	
	private static void executeMethods()
	{
		Sample obj=new Sample();
		try
		{
			Class[] strparam=new Class[1];
			strparam[0]=String.class;
			
			Method method1=obj.getClass().getMethod("showFN", strparam);
			method1.invoke(obj, new String("Santosh"));
			
			
			Class[] strparam2=new Class[2];
			strparam2[0]=String.class;
			strparam2[1]=String.class;
			
			Method method2=obj.getClass().getMethod("displayDetails", strparam2);
			method2.invoke(obj, new String("Sachin"),new String("Tendulkar"));
			
			Class[] intparam=new Class[1];
			intparam[0]=Integer.TYPE;
			
			Method method3=obj.getClass().getMethod("showAge", intparam);
			method3.invoke(obj, 22);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
