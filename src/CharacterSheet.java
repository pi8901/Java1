public class CharacterSheet
{
	
	public static String firstName;
	public static String lastName;
	public static String story;
	public static int type;
	public static int level;

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
		return firstName + " " + lastName + " is a " + translateType(type) + " level " + level + " " + story;
	}
}
