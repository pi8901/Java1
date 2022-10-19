
public class Schachtel 
{

	public static void main(String[] args) 
	{
		System.out.print(" ");
		for(int i = 0; i < 50; i++)
		{
			System.out.print("_");
		}
		System.out.println("");
		for(int i = 0; i < 50; i++)
		{
			System.out.print("|");
			for(int j = 0; j < 50; j++)
			{
				System.out.print(" ");	
			}
			System.out.println("|");
		}
		System.out.print(" ");
		for(int i = 0; i < 50; i++)
		{
			System.out.print("_");
		}
		

	}

}
