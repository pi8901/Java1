
public class Autohaus implements IAutohaus
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	
	public String autohausName;
	public Auto[] platz;
	
	public Autohaus(String n, int p)
	{
		this.autohausName = n;
		platz = new Auto[p];
	}
	
	public void aufDenPlatzStellen(Auto a)
	{
		for(int i = 0; i < platz.length; i++)
		{
			if(platz[i] == null)
			{
				platz[i] = a;
				System.out.println("neu");
				return;
			}
			System.out.println("nicht " + a.anzeige());
		}
	}
	
	public String kundenanfrage(String m, String t, int bj)
	{
		String s = null;
		for(int i = 0; i < platz.length; i++)
		{
			if(platz[i].getMarke() == m && platz[i].getTyp() == t && platz[i].getBaujahr() > bj)
			{
				s = s + platz[i].anzeige();
			}
		}
		if(s == null)
		{
			return "kein auto";
		}
		return "angebot " + s;
	}
	
	public void anzeigeDrucken()
	{
		String s = autohausName + "\n" + "angebot \n";
		for(int i = 0; i < platz.length; i++)
		{
			s = s + "\n" + platz[i].anzeige();
		}
		System.out.println(s);
	}
}
