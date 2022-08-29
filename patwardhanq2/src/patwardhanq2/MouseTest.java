package patwardhanq2;

public class MouseTest 
{
	public static void main(String [] args )
	{
		  EasyFormat f = new EasyFormat();
		  
		  EasyReader kb = new EasyReader();
		  
		  final int STIM = 1000;

		
		double d = 0;
		double s = 0;
		double e = 0;
		
		//Mouse ok = new Mouse();



		for(int x = 0; x < 3; x++)
		{	
		
			Mouse ok = new Mouse();

		ok.InitIsland();

		ok.MoveAbout();

			


			
			if(ok.getDrown() == true)
			{
				System.out.println("IT DROWNED!");
				
				
			//	d++;				
				System.out.println(ok.PrintIsl());
				System.out.println();

			}
			

			else if(ok.getEscape() == true)
			{
				System.out.println("IT ESCAPED!");
				// e++;

				System.out.println(ok.PrintIsl());
				System.out.println();



			}
			
			else if(ok.getStarve() == true) {
			
				System.out.println("IT STARVED!");
				
				//s++;
				System.out.println(ok.PrintIsl());
				System.out.println();


				}
			
			
		

		}
		
		for(int x = 0; x < STIM; x++)
		{
			Mouse ok = new Mouse();
			
			ok.InitIsland();
			ok.MoveAbout();
			
			

			if(ok.getDrown() == true)
			{
				d++;

			}
			

			else if(ok.getEscape() == true)
			{
				e++;



			}
			
			else if(ok.getStarve() == true) {
			
				s++;


				}
			
		}
		
		System.out.println("The mouse has drowned " + (((d+0.0) * 100)/1000) + "%");
		System.out.println("The mouse has starved " + (((s + 0.0) * 100) / 1000) + "%");
		System.out.println("The mouse has escaped " + (((e + 0.0) * 100) / 1000) + "%");

		
		
		
		
		
	}

}
