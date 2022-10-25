import java.util.Arrays;

public class Farbenzaehler 
{
	public static String[] farben = 
	{
		"Cornsilk","Desire","Cornsilk","Cadet","Cyan","Bistre","Fandango","Coffee","Coffee","Corn",
		"Dirt","Blond","Fuchsia","Cardinal","Amber","Deer","Coconut","Claret","Blue-Gray","Bluebonnet","Dandelion","Firebrick","Ceil","Blush","Charcoal","Blue-Violet",
		"Brown-Nose","Folly","Bazaar","Fandango","Carnelian","Denim","Desert","Carmine","Avocado",
		"Emerald","Black","Eucalyptus","Amazon","Capri","Feldspar","Cerise","Champagne","Bone",
		"Artichoke","Catawba","Aureolin","Cinnabar","Copper","Feldgrau","Amber","Bisque","Byzantium",
		"Blue","Cream","Bubbles","Ceil","Bittersweet","Coquelicot","Fawn","Brass","Coral","Cinereous",
		"Eminence","Bronze","Fandango","Buff","Aureolin","Flax","Eggshell","Cordovan","Ceil",
		"Amethyst","Byzantine","Auburn","Aqua","Diamond","Amaranth","Ecru","Citrine","Fallow",
		"Chestnut","Eggplant","Camel","Ceil","Amber","Flattery","Flavescent","Aquamarine",
		"Beige","Beaver","Blue-Green","Almond","Aero","Azure","Fulvous","Burgundy","Cherry","Ceil","Burlywood","Arsenic",
		"AuroMetalSaurus","Celadon","Aureolin","Citron","Bole","Asparagus","Daffodil","Flirt","Drab","Cerulean",
		"Crimson","Blueberry","Celeste","Fandango","Ceil","Boysenberry","Chamoisee","Ebony","Amber","Flame","Apricot"
	};

	public static void main(String[] args) 
	{
		Arrays.sort(farben);
		int count = 0;
		for(int i = 0; i < farben.length ; i++)
		{
			for(int j = i; j < farben.length; j++)
			{
				if(farben[i] == farben[j])
				{
					count ++;
				}
			}
			i = i + count - 1;
			System.out.println(farben[i] + ": " + count);
			count = 0;
		}
	}
}
