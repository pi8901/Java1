import java.util.Random;

public class PasswordGenerator
{

	private Random rand = new Random();
	private char[] password;
	private static final  char[] OPTIONS = new char[] 
	{
					'!', '_', '-', '?', '*', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
					'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'Y', 'X',
					'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'o', 'p',
					'q', 'r', 's', 't','u', 'v', 'w', 'x', 'y', 'z','1','2','3','4','5','6','7','8','9'
					,'0' 
	};
	
	public static void main(String[] args)
	{

	}
	
	public PasswordGenerator(int len)
	{
		password = initializeArray(len);
		createPassword();
		printPassword();
	}
	
	private char[] initializeArray(int val)
	{
		if(val <= 0)
		{
			return new char[8];
		}
		else
		{
			return new char[val];
		}
	}
	
	private int generateRandom()
	{
		return rand.nextInt(OPTIONS.length);
	}
	
	private char getChar()
	{
		return OPTIONS[generateRandom()];
	}

	private void createPassword()
	{
		for(int i = 0; i < password.length; i++)
		{
			password[i] = getChar();
		}
	}
	
	private void printPassword()
	{
		System.out.println(password);
	}
	
	public Random getRand()
	{
		return rand;
	}
	
	public char[] getPassword()
	{
		return password;
	}
}
