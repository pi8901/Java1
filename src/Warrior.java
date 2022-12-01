
public class Warrior extends Player
{

	public Warrior(String name, int lvl)
	{
		super(name, lvl);
		this.weaponType = "sword";
		this.armorType = "plates";
		healUp();
	}
	
	public static void main(String[] args)
	{
		
	}

	@Override
	public void healUp()
	{
		super.setHitpoints(50);
	}
	

	@Override
	public int attack()
	{
		return this.lvl*randomMultiplier()*2;
	}

	@Override
	public String whoAmI()
	{
		return this.charName + " Warrior " + this.lvl + " " + this.armorType + " " + this.weaponType;
	}

}
