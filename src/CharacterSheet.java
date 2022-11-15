public class CharacterSheet
{
	
	public String firstName;
	public String lastName;
	public String story;
	public int type;
	public int level;

	public static void main(String[] args) 
	{
		
	}

	public static String translateType(int type)
	{
		switch (type)
		{
			case 1:
				return "Bard";
			case 2:
				return "Cleric";
			case 3:
				return "Monk";
			case 4:
				return "Thief";
			case 5:
				return "Fighter";
			case 6:
				return "Magician";
			default:
				return "none";
		}
	}
	
	public static String createCharacterStats(CharacterSheet x)
	{
		return x.firstName + " " + x.lastName + " is a " + translateType(x.type) + " level " + x.level + " " + x.story;
	}
}
