package Generics;

public class TemplatesDemo
{
	public static <E extends Number, F extends Number> double sum(E x, F y)
	{
		return x.doubleValue() + y.doubleValue();
	}
	
	public static void Main(String[] args)
	{
		
	}
}
