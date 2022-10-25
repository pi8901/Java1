
public class Kugelvolumen 
{

	public static void main(String[] args) 
	{
		double[] arr = new double[6];
		for(int i = 0; i < 6; i++)
		{
			arr[i] = Math.random() * 10.0;
			System.out.println("Volumen der Kugel " + i + 1 + " mit dem Radius r= " + arr[i] + " betraegt " + Math.PI * Math.pow(arr[i], 2.0));
		}

	}

}
