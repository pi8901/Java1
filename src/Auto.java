
public class Auto implements IAuto
{
	
	private String marke;
	private String typ;
	private String farbe;
	private int baujahr;
	private int preis;
	private int ps;
	private boolean gebraucht;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	
	public Auto(String marke, String typ, String farbe,int baujahr, int ps, boolean gebraucht, int preis)
	{
		this.marke = marke;
		this.typ = typ;
		this.farbe = farbe;
		this.baujahr = baujahr;
		this.ps = ps;
		this.gebraucht = gebraucht;
		this.preis = preis;
	}

	@Override
	public String getMarke()
	{
		// TODO Auto-generated method stub
		return marke;
	}

	@Override
	public String getTyp()
	{
		// TODO Auto-generated method stub
		return typ;
	}

	@Override
	public String getFarbe()
	{
		// TODO Auto-generated method stub
		return farbe;
	}

	@Override
	public int getBaujahr()
	{
		// TODO Auto-generated method stub
		return baujahr;
	}

	@Override
	public int getPreis()
	{
		// TODO Auto-generated method stub
		return preis;
	}

	@Override
	public int getPs()
	{
		// TODO Auto-generated method stub
		return ps;
	}

	@Override
	public boolean istGebraucht()
	{
		// TODO Auto-generated method stub
		return gebraucht;
	}

	@Override
	public String anzeige()
	{
		// TODO Auto-generated method stub
		String s = marke + " " + typ + " " + farbe + " " + baujahr + " " + preis + " " + ps;
		if(istGebraucht())
		{
			return s + "gebraucht";
		}
		return s + "neu";
	}

}
