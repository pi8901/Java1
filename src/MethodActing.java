
public class MethodActing 
{

	public static String line;
	
	public static void main(String[] args) 
	{
		
	}
	
	public static void tellLine(String in)
	{
		line = in;
	}
	
	public static void speak()
	{
		System.out.println(line);
	}
	
	public static void shout()
	{
		System.out.println("!!" + line + "!!");
	}
	
	public static void whisper()
	{
		System.out.println("**" + line + "**");
	}
	
	
	
	
	

}
