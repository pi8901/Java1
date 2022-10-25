
public class NotAnotherSchachtel 
{

	public static char[][] schachtel;
	
	public static void main(String[] args) 
	{
		System.out.print(" ");
		for(int i = 0; i < schachtel[0].length; i++)
		{
			System.out.print("_");
		}
		System.out.println(" ");
		for(int i = 0; i < schachtel.length - 2; i++)
		{
			System.out.print("|");
			for(int j = 0; j < schachtel.length ; j++)
			{
				System.out.print(" ");	
			}
			System.out.println("|");
		}
		System.out.print(" ");
		for(int i = 0; i < schachtel[0].length; i++)
		{
			System.out.print("_");
		}
		System.out.print(" ");
	}
}
