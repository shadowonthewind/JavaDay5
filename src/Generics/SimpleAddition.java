package Generics;

public class SimpleAddition
{
	private int a, b;
	private float c, d;

	public int sum(int a, int b)
	{
		int c = a + b;
		System.out.println("Sum is " + c);
		return c;
	}

	public float sum(float a, float b)
	{
		float c = a + b;
		System.out.println("Sum is " + c);
		return c;
	}
}
