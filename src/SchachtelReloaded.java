
public class SchachtelReloaded 
{

	public static short groesse = 10;
	
	public static void main(String[] args) 
	{
		System.out.print(" ");
		for(int i = 0; i < groesse; i++)
		{
			System.out.print("_");
		}
		System.out.println(" ");
		for(int i = 0; i < groesse; i++)
		{
			System.out.print("|");
			for(int j = 0; j < groesse ; j++)
			{
				System.out.print(" ");	
			}
			System.out.println("|");
		}
		System.out.print(" ");
		for(int i = 0; i < groesse; i++)
		{
			System.out.print("_");
		}
		System.out.print(" ");

	}

}
