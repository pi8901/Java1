public class Inventory
{

	public Item[] bag = new Item[0];
	
	public static void main(String[] args)
	{

	}
	
	public void setBagSize(int size)
	{
		if(size < 1)
		{
			bag = new Item[1];
		}
		else
		{
			bag = new Item[size];
		}
	}
	
	public boolean addItem(Item item)
	{
		for(int i = 0; i < bag.length; i++)
		{
			if(bag[i] == null)
			{
				bag[i] = item;
				System.out.println("Success");
				return true;
			}
		}
		System.out.println("no free");
		return false;
	}
	
	public void listAllItemsOfType(int type)
	{
		for(int i = 0; i < bag.length; i++)
		{
			if(bag[i] != null && bag[i].type == type)
			{
				System.out.println(bag[i].describe());
			}
		}
	}
	
	public void listAllItemsOfQuality(int q)
	{
		for(int i = 0; i < bag.length; i++)
		{
			if(bag[i] != null && bag[i].quality == q)
			{
				System.out.println(bag[i].describe());
			}
		}
	}
	
	public void lookAtInventory()
	{
		int val = 0;
		for(int i = 0;i < this.bag.length; i++)
		{
			if(bag[i] == null)
			{
				System.out.println("slot " + i + ":\tempty");
			}
			else
			{
				val = val + bag[i].getValue();
				System.out.println("slot " + i + ":\t" + bag[i].describe());
			}
		}
		System.out.println("Total Value: " + val);
	}
	
	public Item[] getBag()
	{
		return this.bag;
	}
}
