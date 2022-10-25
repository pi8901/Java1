public class Regenbogen 
{

	public static void main(String[] args) 
	{
		String a = "rot";
		String b = "orange";
		String c = "gelb";
		String d = "gruen";
		String e = "blau";
		String f = "indigo";
		String g = "violett";
		
		String[] rainbow = {
				"rot", "orange", "gelb", "gruen", "blau", "indigo", "violett"
		};
		
		System.out.println("Die Farben des Regenbogens sind (variable):");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
		System.out.println("Die Farben des Regenbogens sind (array):");
		for(int i = 0; i < rainbow.length; i++)
		{
			System.out.println(rainbow[i]);
		}
	}
}
