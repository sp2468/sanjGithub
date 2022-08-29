package patwardhanq2;

public class SquareTest {
	
	public static void main(String[] args)
	{
		Square obj = new Square();
		
		EasyReader kb = new EasyReader("Square");
		int n = 4;
		
		int[][] square = new int[n][n];
		 
		
		int input = kb.readInt();
		
		int count = 0;
		
		boolean isMagic = false;

		int rand = 0;

		while(input != -1)
		{
			
			count++;
			
			input = kb.readInt();
			
			
		}
		
		
		
		if(obj.metsRequir1(count) == false)
		{
			System.out.println("Failed requirement one");
		}
		
		else {
			System.out.println("Passed requirement one");
		}
		
		if(obj.metsRequir2() == false)
		{
			System.out.println("Failed requirement two");
		}
		else {
			System.out.println("Passed requirement two");
		}
		
		
	
	if(obj.metsRequir3() == false)	
		{
			System.out.println("Failed requirement three");
		}
		
		else {
			System.out.println("Passed requirement three");
		}
		
		

		
		if(obj.metsRequir1(count) && obj.metsRequir2() && obj.metsRequir3())
		{
			System.out.println("This is a magic square!");

		}
		
		else {
			System.out.println("This is not a magic square!");
		}
		
	}

}
