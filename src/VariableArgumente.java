import java.util.Arrays;

public class VariableArgumente 
{

	public static void main(String[] args) 
	{
	}
	
	public static int sum(int... nums)
	{
		return Arrays.stream(nums).sum();
	}
	
	public static double average(double... n)
	{
		return Arrays.stream(n).sum() / n.length;
	}
	
	public static void powers(int p, double... nums)
	{
		for(int i = 0; i < nums.length; i++)
		{
			System.out.println((double) (Math.pow(p, nums[i])));
		}
	}
	
	public static void printTexts(boolean b, String... s)
	{
		if(b == true)
		{
			for(int i = 0; i < s.length; i++)
			{
				System.out.println(s[i]);
			}
		}
		else
		{
			for(int i = s.length - 1; i >= 0; i--)
			{
				System.out.println(s[i]);
			}
		}
	}
	
	public static void printSchachteln(int... sizes)
	{
		for(int i = 0; i < sizes.length; i++)
		{
			System.out.println(generateSchachtel(sizes[i]));
		}
	}
	
	public static String generateSchachtel(int size)
	{
		String s = "";
		s = s + printLN(size ,' ', '_');
		for(int i = 0; i < size; i++)
		{
			s = s + printLN(size, '|', ' ');
		}
		s = s + printLN(size ,' ', '_');
		return s;
	}
	
	public static String printLN(int level, char a, char b)
	{
		String s = "";
		s = s + a;
		for(int i = 0; i < level; i++)
		{
			s = s + b;
		}
		
		s = s + a + "\n";
		return s;
	}
}
