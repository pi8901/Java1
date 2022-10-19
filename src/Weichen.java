
public class Weichen 
{

	public static void main(String[] args) 
	{
		for(int i = 1000; i >= 0; i--)
		{
	
			if( i % 2 == 0)
			{
				System.out.println( i +  "ist gerade");
			}
			else
			{
				System.out.println(i + "ist ungerade");
			}
			if(i == 500)
			{
				System.out.println("Halbzeit!");
			}
		}
		System.out.println("fertig");

	}

}
