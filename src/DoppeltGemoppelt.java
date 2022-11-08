import java.util.Arrays;

public class DoppeltGemoppelt 
{

	public static void main(String[] args) 
	{
	}
	
	public static void say(String[] arr)
	{
		for(int i =0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void say(char[] arr)
	{
		for(int i =0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static int add(int[] arr)
	{
		return Arrays.stream(arr).sum();
	}
	
	public static double add(double[] arr)
	{
		return Arrays.stream(arr).sum();
	}
	
	public static String paint(String item, int c)
	{
		String s = "";
		for(int i = 0; i < c; i++)
		{
			s = s + item;
		}
		return s;
	}
	
	public static String paint(int c, String item)
	{
		String s = "";
		for(int i = 0; i < c; i++)
		{
			s = s + item + "\n";
		}
		return s;
	}
}