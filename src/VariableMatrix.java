public class VariableMatrix 
{
	public static int xStart = 1;
	public static int xEnde = 5;
	public static int yStart = 10;
	public static int yEnde = 15;
	public static int modus = 1;

	public static void main(String[] args) 
	{
		for(int i = yStart; i <= yEnde; i++)
		{
			for(int j = xStart; j <= xEnde; j++)
			{
				if(modus == 1)
				{
					System.out.print( "" + i +"+" + j + "=" + j + i + "\t");
				}
				if(modus == 2)
				{
					System.out.print( "" + i + "-" + j + "=" + (j - i) + "\t");
				}
				if(modus == 3)
				{
					System.out.print( "" + i +"*" + j + "=" + (float) j * i + "\t");
				}
				if(modus == 4)
				{
					System.out.print( "" + i +"/" + j + "=" + (float) i / j + "\t");
				}			
			}
			System.out.println("");
		}
	}
}