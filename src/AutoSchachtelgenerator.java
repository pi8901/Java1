
public class AutoSchachtelgenerator
{

	private int hoehe;
	private int breite;
	
	public static void main(String[] args)
	{
		

	}
	
	public AutoSchachtelgenerator(int a, int b)
	{
		this.hoehe = a;
		this.breite = b;
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
