
public class Mage extends Player
{

	public Mage(String name, int lvl)
	{
		super(name, lvl);
		this.armorType = "cloth";
		this.weaponType = "magic spell";
		healUp();
	}
	
	public static void main(String[] args)
	{
		
	}

	@Override
	public void healUp()
	{
		super.setHitpoints(40);
		
	}

	@Override
	public int attack()
	{
		return  lvl*randomMultiplier()*5;
	}

	@Override
	public String whoAmI()
	{
		return this.charName + " Mage " + this.lvl + " " + this.armorType + " " + this.weaponType;
	}

}
