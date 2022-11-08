import java.util.Arrays;

public class Brotdose 
{
	
	public static String[] dose;

	public static void main(String[] args) 
	{		
	}
	
	public static void setDose(String[] inhalt)
	{
		dose = inhalt;
	}
	
	public static boolean doseLeer()
	{
		return (dose == null);
	}
	
	public static int anzahlBrote()
	{
		if(doseLeer())
		{
			return - 1;
		}
		else
		{
			return Arrays.stream(dose).filter(s -> s.contains("brot")).toArray().length;
		}
	}
	
	public static String doseAnschauen()
	{
		if(doseLeer())
		{
			return "leer";
		}
		else
		{
			String s = "";
			for(int i = 0; i < dose.length; i++)
			{
				s = s + dose[i] + ",";
			}
			return s;
		}
	}
	
	public static void printDose()
	{
		System.out.println(doseAnschauen());
	}
}
