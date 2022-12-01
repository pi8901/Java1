
public class Arena
{
	public Player[] players;
	public String zoneName;
	public int minLvl;
	public int maxLvl;
	
	public Arena(String name, int maxPlayers, int minLvl, int maxLvl)
	{
		this.zoneName = name;
		this.minLvl = minLvl;
		this.maxLvl = maxLvl;
		players = new Player[maxPlayers];
	}
	
	public static void main(String[] args)
	{
		
	}
	
	public boolean addPlayer(Player p)
	{
		if(p.lvl < maxLvl && p.lvl > minLvl)
		{
			for(int i = 0; i < players.length; i++)
			{
				if(players[i] == null)
				{
					players[i] = p;
					return true;
				}
			}
		}
		System.out.println("error");
		return false;
	}
	
	public void printAllPlayers()
	{
		for(int i = 0; i < players.length; i++)
		{
			System.out.println(players[i].whoAmI());
		}
	}
	
	public void identifyPlayerClass(Player... p)
	{
		for(int i = 0; i < p.length; i++)
		{
			System.out.println(p[i].charName + ", " + p[i].getClass() + " lvl" + p[i].lvl + " is approaching");
		}
	}
	
	public void fight(int p1, int p2)
	{
		Player a = players[p1];
		Player b = players[p2];
		
		while(a.hitpoints > 0 && b.hitpoints > 0)
		{
			int v = a.attack();
			b.hitpoints = b.hitpoints - v;
			System.out.println(fightLine(a, b, v));
			if(b.hitpoints <= 0)
			{
				System.out.println("Player" + b.charName + " is dead.");
				break;
			}
			v = b.attack();
			a.hitpoints = a.hitpoints - v;
			System.out.println(fightLine(b, a, v));
			if(a.hitpoints <= 0)
			{
				System.out.println("Player" + a.charName + " is dead.");
				break;
			}
		}
	}
	
	public String fightLine(Player a, Player t, int val)
	{
		return a.charName + " hits " + t.charName + " with " + a.weaponType + " for " + val + " damage.";
	}
}

