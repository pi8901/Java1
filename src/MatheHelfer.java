import java.util.Arrays;

public class MatheHelfer 
{
	public static void subtrahiere(int a, int b)
	{
		System.out.println(a  + "-" + b + "=" + (a-b));
	}
	
	public static void main(String args[]) {};
	
	public static void dividiere(int a, int b)
	{
		System.out.println(a  + "/" + b + "=" + (double) (a/b));
	}
	
	public static void berechneFlaecheRechteck(int a, int b)
	{
		System.out.println("Flaeche Rechteck mit Seiten " + a + "," + b + ": " + (a*b));
	}
	
	public static void berechneVolumenRechteck(int a, int b, int c)
	{
		System.out.println("Volumen Rechteck mit Seiten " + a + "," + b + " und Hoehe " + c + ": " + (a*b*c));
	}
	
	public static void addiere(int[] arr)
	{
		System.out.println("Summe der Zahlen: " + Arrays.stream(arr).sum());
	}
	
	public static void median(int[] arr)
	{
		Arrays.sort(arr);
		System.out.print("Zahlen: ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + ",");
		}
		System.out.print(" Median: " + arr[arr.length/2] + "\n");
	}
}
