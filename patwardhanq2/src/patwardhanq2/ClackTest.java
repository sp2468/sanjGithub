package patwardhanq2;

public class ClackTest {

	public static void main(String[] args) 
	{
		EasyReader kb = new EasyReader();
		
		System.out.println("Let's Play");		
		System.out.println();


		
		Clack obj = new Clack ();
		
	
	
		System.out.println("Numbers to cover:");
		System.out.println(obj.displayBoard());
		
		System.out.println();
		
		System.out.println("Enter y to roll the dice!");
		
		String pressd = kb.readWord();
		
		//System.out.println(press);
		
			
			
		
		

		 int tosses = 0;
		
		while(pressd.equals("y"))
		{
			tosses++;
			
			obj.Throw();
			
			System.out.print("You rolled a " + obj.getDice1() + " and a " + obj.getDice2());
			System.out.println("     Your number of throws is " + tosses);
			System.out.println("Enter i or t");
			
			String lets = kb.readWord();
			char let = lets.charAt(0);
			
			obj.Cover(let);
			
			System.out.println();

			System.out.println("Numbers to cover:");
			System.out.println(obj.displayBoard());
			
			System.out.println("ROLL AGAIN!!");
			
			
			//System.out.print();
			

			
			pressd = kb.readWord();
		}
		
		
		System.out.println("GAME OVER :((");
		
		
		

		
		

	}

}
