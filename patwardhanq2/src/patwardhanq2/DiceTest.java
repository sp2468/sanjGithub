package patwardhanq2;

public class DiceTest 
{
	public static void main (String[] args)
	{
		Dicee obj = new Dicee();
		
		EasyReader kb = new EasyReader();
		System.out.println("How many times do u want to roll?");
		
		int rolls = kb.readInt();
		
		
		
		System.out.println("Let's process the request.........");
		System.out.println("Here are the results after " + rolls + " rolls");
		System.out.println();


		
		for(int x = 0; x < rolls; x++ )
		{
			obj.numbs();
			
		}

		
		
		for(int x = 2; x < 13; x++ )
		{
			
			System.out.println(x + ": " + obj.bar(x) + ".00%");
			
			
			
		}

		
		
	}
		
		
	
}
