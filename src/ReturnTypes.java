import java.util.Arrays;

public class ReturnTypes 
{

	public static void main(String[] args) 
	{
		int[] values = new int[] { -15, -25, 26, 36, 37, 12, 15, -31, 36, -15, -33 };
		System.out.println(statistics(values));
	}
	
	public static String statistics(int[] arr)
	{
		String s = "";
		s = "Number of values: " + arr.length;
		s = s + "\nNumber of negative values removed: " + (arr.length - removeBelowZero(arr).length);
		arr = removeBelowZero(arr);	
		s = s + "\nHighest value in dataset: " + highest(arr);
		s = s + "\nLowest value in dataset: " + lowest(arr);
		s = s + "\nLowest is " + percentageOf(lowest(arr), highest(arr)) + " % of highest value";
		return s;
	}
	
	public static int[] removeBelowZero(int[] arr)
	{
		return Arrays.stream(arr).filter(s -> s >= 0).toArray();
	}
	
	public static double percentageOf(int part, int total)
	{
		double a = part;
		double b = total;
		return ( a * 100 / b);
	}
	
	public static int lowest(int[] arr)
	{
		return Arrays.stream(arr).min().getAsInt();
	}
	
	public static int highest(int[] arr)
	{
		return Arrays.stream(arr).max().getAsInt();
	}
}
