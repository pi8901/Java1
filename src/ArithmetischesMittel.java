
public class ArithmetischesMittel 
{

	public static void main(String[] args) 
	{
		int start = -49;
		int ende = 5000;
		int sum = 0;
		int count = 0;
		for(int i = start ; i <= ende; i++)
		{
			sum = sum + i;
			count ++;
		}
		
		System.out.println("Summe aller Zahlen von "+ start + " bis " + ende + " ist " + sum + 
				" und der Durchschnitt betraegt " + (float) sum / count +  ".");

	}

}
