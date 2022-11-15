public class Item
{

	public String name;
	public int type;
	public int value;
	public int quality;

	public static void main(String[] args)
	{

	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getType()
	{
		return type;
	}

	public void setType(int type)
	{
		this.type = type;
	}

	public int getValue()
	{
		return value;
	}

	public void setValue(int value)
	{
		this.value = value;
	}

	public int getQuality()
	{
		return quality;
	}

	public void setQuality(int quality)
	{
		this.quality = quality;
	}

	public String translateType()
	{
		switch (type)
		{
			case 0:
				return "armor";
			case 1:
				return "weapon";
			case 2:
				return "potion";
			case 3:
				return "consumable";
			default:
				return "";
		}
	}

	public String translateQuality()
	{
		switch (quality)
		{
			case 0:
				return "average";
			case 1:
				return "unusual";
			case 2:
				return "rare";
			case 3:
				return "epic";
			case 4:
				return "legendary";
			default:
				return "";
		}
	}
	
	public String describe()
	{
		return name + ", " + translateType() + " " + translateQuality() + ", " + value;
	}
}
