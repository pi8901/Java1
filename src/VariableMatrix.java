
public class VariableMatrix 
{
	public static int xStart = 1;
	public static int xEnde = 5;
	public static int yStart = 10;
	public static int yEnde = 15;
	public static int modus = 4;

	public static void main(String[] args) 
	{
		if(modus == 1)
		{
			
			for(int i = yStart; i <= yEnde; i++)
			{
				for(int j = xStart; j <= xEnde; j++)
				{
					System.out.print( "" + i +"+" + j + "=" + j + i + "\t");
				}
				System.out.println("");
			}
		}
			
		if(modus == 2) 
		{
			for(int i = yStart; i <= yEnde; i++)
			{
				for(int j = xStart; j <= xEnde; j++)
				{
					System.out.print( "" + i + "-" + j + "=" + (j - i) + "\t");
				}
				System.out.println("");
			}
		}
			
		if(modus == 3)
		{
			for(int i = yStart; i <= yEnde; i++)
			{
				for(int j = xStart; j <= xEnde; j++)
				{
					System.out.print( "" + i +"*" + j + "=" + (float) j * i + "\t");
				}
				System.out.println("");
			}
		}
			
		if(modus == 4)
		{
			for(int i = yStart; i <= yEnde; i++)
			{
				for(int j = xStart; j <= xEnde; j++)
				{
					System.out.print( "" + i +"/" + j + "=" + (float) i / j + "\t");
				}
				System.out.println("");
			}
		}
	}

}

