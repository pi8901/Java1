
public class Box implements Comparable<Box>
{
	
	public int hoehe;
	public int breite;
	public int tiefe;
	public int v;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	
	public Box(int a, int b, int c)
	{
		this.hoehe = a;
		this.breite = b;
		this.tiefe = c;
		this.v = a * b * c;
	}
	
	@Override
	public String toString()
	{
		return "" + hoehe + " " + breite +" " + tiefe + " " + v;
	}

	@Override
	public int compareTo(Box o)
	{
		if(o.toString()  == this.toString())
		{
			return 0;
		}
		if(this.v  > o.v)
		{
			return 1;
		}
		return -1;
	}

}
