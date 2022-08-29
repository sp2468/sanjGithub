package patwardhanq2;

import java.util.ArrayList;
import java.util.Random;

public class PileTest 
{

	public static void main (String[] args)
	{
		ArrayList<Pile> cards = new ArrayList<Pile>();
		
		Random randy = new Random();
		
		int sum =0;

		//randomizer
		while(sum < 45)
		{
			Pile temp= new Pile(randy.nextInt(15)+1);
			
			sum = sum + temp.getNumcards();
			if(sum < 45)
			{
				cards.add(temp);	
				
			}
			
		}
		
		int yum =0;
		
		for(int x=0; x<cards.size(); x++)
		{
		
			yum = yum + cards.get(x).getNumcards();
		
		
		}
		
		yum = 45 - yum;
		
		Pile lastPile = new Pile(yum);
		
		cards.add(lastPile);
		
		System.out.print("Sample Run: ");
		for(int x=0; x<cards.size(); x++)
		{
		
		System.out.print(cards.get(x).getNumcards() + " ");
		
		}
		
		System.out.println();
		System.out.println();

		
		System.out.println("Iterations:");

		
		int count =0;
		
	
		boolean goat = false;
	
		//iteration starter
		while(goat == false)
		{
			int number =9;
			int temp = 0;
			
			for(int y =0; y < cards.size(); y++)
			{
			
				cards.get(y).deduct();
			}
			
			Pile tran = new Pile(cards.size());
			
			cards.add(0,tran);
			
			for(int ja = cards.size() -1; ja >=0; ja--)
			{
			
				if(cards.get(ja).getNumcards() == 0)
			{
					cards.remove(ja);
			
			}
				
			}
			
			for(int s=0; s< cards.size(); s++)
			{
				
			System.out.print(cards.get(s).getNumcards() + " ");
			
			}
			
			System.out.println();
			
			
			
			
			for(int sd=0; sd < cards.size(); sd++)
			{
				
				if(cards.get(sd).getNumcards() == number)
				{
					temp++;
				}
				
				number--;
			}
			
			if(temp == 9)
			{
				goat = true;
			}
			
			count++;
		}
		
		
		
		System.out.println("The number of iterations are " + count);

		

		
		
		
		
	}
}
