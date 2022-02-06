package patwardhanq2;

public class popcornTest 
{
	public static void main(String [] args)
	{
		EasyReader file = new EasyReader("popcorn.dat");
		EasyFormat fo = new EasyFormat();
		
		
		System.out.println(fo.format("Popcorn Co-Op", 70, 'C', 0));
		System.out.println(fo.format("Production in", 70, 'C', 0));
		System.out.println(fo.format("Farm Name", 10, 'C', 0));
		System.out.println(fo.format("Thousands of", 70, 'C', 0));
		System.out.println(fo.format("Pint Jars per Acre", 75, 'C', 0));
		
		System.out.println(fo.format("1   2   3   4   5   6 ", 58, 'R', 0));
		System.out.println(fo.format("|", 38, 'R', 0) + fo.format("|", 4, 'R', 0) +  fo.format("|", 4, 'R', 0) + fo.format("|", 4, 'R', 0)  +  fo.format("|", 4, 'R', 0)  +  fo.format("|", 4, 'R', 0));
		System.out.println(fo.format("---|---|---|---|---|---|", 58, 'R', 0));
		
		for(int x = file.readInt(); x > 0; x--)
		{
			String name = "";
			char letter = file.readChar();
			while(letter != '*')
			{
				name = name + letter;
				letter = file.readChar();
			}
			
			double acres = 0;
			double jars = 0;
			int numAsteriks = 0;
			acres = file.readDouble();
			jars = file.readDouble();
			
			char dummy = file.readChar();
			
			popcorn obj = new popcorn(name, acres, jars, numAsteriks );
			
			//obj.calAes();
			
			System.out.print(fo.format(obj.getName(), 25, 'R', 0));
			//System.out.println(fo.format(obj.makeBar(), 51, 'L', 34 - (obj.getName().length())));
		}


	} 
}
