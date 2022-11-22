
public class User
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	
	public User(String name, int lvl)
	{
		System.out.println("player "+name+" ("+lvl+") was created successfully");
	}
	
	public User(String name, String action)
	{
		System.out.println("player" + name + " did " + action);
	}
	
	public User(String name, int lvl, String action)
	{
		System.out.println("player "+name+" ("+lvl+") was created successfully while doing " + action);
	}
}