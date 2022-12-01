
public class SchachtelOverride
{
	private int hoehe;
	private int breite;

	public static void main(String[] args)
	{
		
	}
	
	public SchachtelOverride(int h, int b)
	{
		this.hoehe = h;
		this.breite = b;
	}
	
	@Override
	public String toString()
	{
		return "Schachtel(" + this.hoehe + ", " + this.breite + ")";
	}
	
	@Override
	public boolean equals(Object o)
	{

		if(this == o || this.hashCode() == o.hashCode())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public int hashCode()
	{
		return (42 * 9 + this.hoehe) * 9 + breite;
	}
	
	
	
	public String schachtelGenerieren()
	{
		String s = printLN(0, ' ', '_');
		for(int i = 0; i < this.hoehe ; i++)
		{
			s = s + printLN(i, '|', ' ');
		}
		return  s + printLN(this.hoehe,' ', '_');
	}
	
	private String printLN(int level, char a, char b)
	{
		String s = "" + a;
		
		for(int i = 0; i < this.breite; i++)
		{
			s = s + b;
		}
		return s + a + "\n";
	}

}
