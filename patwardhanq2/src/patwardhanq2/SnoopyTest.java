package patwardhanq2;

public class SnoopyTest {

	
	public static void main(String[] args)
	{
		char[][] temp = new char[46][75];
		Snoopy obj = new Snoopy(temp);
		EasyReader rad = new EasyReader("space.dat");
		

		for (int x = 0; x<temp.length; x++) 
		{
			temp[x] = rad.readLine().toCharArray();
		
			System.out.println(temp[x]);
		}


		
		


		
		obj.chaInt();
		obj.detectChanges();
		obj.intToChar();
		System.out.println(obj.printChar());
		
	}
	
	
	
	
	
	
	
	
	}
	
	
	
	

