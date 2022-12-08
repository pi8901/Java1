import java.time.Year;

public class Kollege implements Comparable<Kollege> , IKollege
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	
	public int personalNummer;
	public int einstellungsJahr;
	public String name;
	
	public Kollege(int p, int e, String n)
	{
		this.personalNummer = p;
		this.einstellungsJahr = e;
		this.name = n;
	}

	@Override
	public void nameAendern(String neuerName)
	{
		this.name = neuerName;
		
	}
	
	@Override
	public String toString()
	{
		return personalNummer + " " + einstellungsJahr + " " + name;
	}

	@Override
	public int dienstjahre()
	{
		return Year.now().getValue() - einstellungsJahr;
	}

	@Override
	public int compareTo(Kollege o)
	{
		if(this.dienstjahre() > o.dienstjahre())
		{
			return -1;
		}
		else if(this.dienstjahre() < o.dienstjahre())
		{
			return 1;
		}
		return 0;
	}

}
