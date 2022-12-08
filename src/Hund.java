
public class Hund implements Tierable
{

	public String name;
	public String futter;
	public String laut;
	
	public Hund(String name, String futter, String laut) 
	{
		this.name = name;
		this.futter = futter;
		this.laut = laut;
	}
	
	@Override
	public String fressen()
	{
		return "frisst " + futter;
	}
	@Override
	public String lautGeben()
	{
		return "macht " + laut;
	}
	
	public void umbenennen(String n)
	{
		this.name = n;
	}
	
	public static void main(String[] args)
	{
		
	}
	
	

}
 