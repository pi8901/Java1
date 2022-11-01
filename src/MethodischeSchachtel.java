public class MethodischeSchachtel 
{
	
	public static char[][] schachtel = new char[5][4];
	public static int height;
	public static int width;

	
	public static void main(String[] args) 
	{
		height = schachtel.length;
		width = schachtel[0].length;
		
		printLN(0, ' ', '_');
		for(int i = 1; i < height - 1; i++)
		{
			printLN(i, '|', ' ');
		}
		printLN(height - 1,' ', '_');
	}
	
	/*
	 * prints one horizontal line
	 * a = Outline
	 * b = Inside
	 * level = height
	*/
	public static void printLN(int level, char a, char b)
	{
		System.out.print(a);
		schachtel[level][0] = a;
		
		for(int i = 1; i < width - 1; i++)
		{
			System.out.print(b);
			schachtel[level][i] = b;
		}
		
		System.out.print(a + "\n");
		schachtel[level][width - 1] = a;
	}
}