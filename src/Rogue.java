
public class Rogue extends Player
{

	public Rogue(String name, int lvl)
	{
		super(name, lvl);
		this.armorType = "leather";
		this.weaponType = "dagger";
		healUp();
	}
	
	public static void main(String[] args)
	{
		
	}

	@Override
	public void healUp()
	{
		super.setHitpoints(45);
		
	}

	@Override
	public int attack()
	{
		return  (int) (lvl*randomMultiplier()*3.5);
	}

	@Override
	public String whoAmI()
	{
		return this.charName + " Rogue " + this.lvl + " " + this.armorType + " " + this.weaponType;
	}

}
