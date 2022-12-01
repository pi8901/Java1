import java.util.Random;

public abstract class Player
{

	public String charName;
	public int lvl;
	public String armorType;
	public String weaponType;
	public int hitpoints;
	public static Random ran = new Random();

	public Player(String name, int lvl)
	{
		this.charName = name;
		this.lvl = lvl;
	}
	
	public static void main(String[] args)
	{
		
	}
	
	public void setHitpoints(int m)
	{
		this.hitpoints = this.lvl * m;
	}
	
	public int randomMultiplier()
	{
		return ran.nextInt(3) + 1;	
	}

	public String getArmorType()
	{
		return armorType;
	}

	public String getWeaponType()
	{
		return weaponType;
	}
	
	public abstract void healUp();
	public abstract int attack();
	public abstract String whoAmI();
}
