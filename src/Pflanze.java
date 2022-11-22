
public class Pflanze
{

	public String name;
	public String farbe;
	public boolean kannBluehen;
	public boolean istStaude;
	public int hoehe;
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	
	public Pflanze(String name, String farbe, boolean istStaude, boolean kannBluehen, int hoehe)
	{
		this.name = name;
		this.farbe = farbe;
		this.istStaude = istStaude;
		this.kannBluehen = kannBluehen;
		this.hoehe = hoehe;
	}
	
	public String selbstBeschreibung()
	{
		String s = "Planze " + name + " ist " + farbe + " und ist " + hoehe + " hoch";
		if(kannBluehen)
		{
			s = s + ", bluehend";
		}
		
		if(istStaude)
		{
			s = s + ", Staude";
		}
		else
		{
			s = s + ", einjaehrig";
		}
		
		return s;
	}
	
	

}
