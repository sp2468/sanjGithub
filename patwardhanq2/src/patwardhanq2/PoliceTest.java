package patwardhanq2;

import java.util.ArrayList;

public class PoliceTest {

	public static void main(String[] args)
	{
		EasyFormat f= new EasyFormat();
		
		ArrayList<People> peep = new ArrayList<People>();
		ArrayList<Items> item = new ArrayList<Items>();
		
		EasyReader kb = new EasyReader("stuff.dat");
		EasyReader file = new EasyReader("info.dat");
		
		String read = file.readLine();
		
		while(!read.equals("stop"))
		{
			String[] arr = read.split("\\,");
			
			String id =arr[0];
			String first = arr[1];
			String last = arr[2];
			String phone = arr[3];
			
			People people = new People(id, first, last, phone);
			
			peep.add(people);
			
			
			read = file.readLine();
			
		}
		
		String rad = kb.readLine();
		while(!rad.equals("no"))
		{
			String[] list = rad.split("\\*");
			
			String id = list[0];
			String descrip = list[1];

			
			Items obj = new Items(id, descrip);
			
			
			item.add(obj);
			
			
			rad = kb.readLine();
		}
		
		int atLeast =0;
		
		System.out.println("Police Report:               " + "Date 2/10/2014");
		System.out.println();
		
			for(int x=0; x< item.size(); x++)
			{
				atLeast =0;
				
				for(int y =0; y< 20; y++)
				{
					if(item.get(x).getID().equals(peep.get(y).getID()))
					{
						System.out.println("Owner: " +(f.format(peep.get(y).getFirst(), 10, 'L', 0)) + (f.format(peep.get(y).getLast(), 10, 'L', 0)) + (f.format(item.get(x).getDescrip(), 39, 'C', 0)) + (f.format(peep.get(y).getPhone(), 45, 'R', 0)));
						atLeast++;
						
					}
					
					
					
				}
				
				if(atLeast == 0)
				{
					System.out.println( f.format("No Match", 10, 'L', 0) +(f.format(item.get(x).getDescrip(), 68, 'C', 0)) + (f.format(item.get(x).getID(), 33, 'R', 0)));
					
				}
			}
			
			
		
		
	}
}
