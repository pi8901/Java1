
public class Garten
{

	public static Pflanze[] beet;
	
	public static void main(String[] args)
	{
		
	}
	
	public static void pflanzen(Pflanze[] z)
	{
		beet = z;
	}
	
	public static void alleBeschreiben()
	{
		for(int i = 0; i < beet.length; i++)
		{
			System.out.println(beet[i].selbstBeschreibung());
		}
	}
	
	public static Pflanze[] getBeet()
	{
		return beet;
	}

}
