public class NotAnotherSchachtel 
{

	public static char[][] schachtel = new char[10][12];
	
	public static void main(String[] args) 
	{
		//Top bar
		System.out.print(" ");
		schachtel[0][0] = ' ';
		for(int i = 1; i < schachtel[0].length - 1; i++)
		{
			schachtel[0][i] = '_';
			System.out.print("_");
		}
		schachtel[0][schachtel[0].length - 1] = ' ';
		System.out.println(" ");
		
		//mid section
		for(int i = 1; i < schachtel.length - 1; i++)
		{
			System.out.print("|");
			schachtel[i][0] = '|';
			for(int j = 1; j < schachtel[0].length - 1 ; j++)
			{
				schachtel[i][j] = ' ';
				System.out.print(" ");	
			}
			System.out.println("|");
			schachtel[i][schachtel[0].length - 1] = '|';
		}
		
		//bottom bar
		System.out.print(" ");
		schachtel[schachtel.length - 1][0] = ' ';
		for(int i = 1; i < schachtel[0].length - 1; i++)
		{
			schachtel[schachtel.length - 1][i] = '_';
			System.out.print("_");
		}
		System.out.print(" ");
		schachtel[schachtel.length - 1][schachtel[0].length - 1] = ' ';
	}
}
