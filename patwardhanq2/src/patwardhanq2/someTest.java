package patwardhanq2;

import java.util.ArrayList;
import java.util.Collections;

public class someTest {
	
	public static void main(String[] args)
	
	{
		EasyFormat f= new EasyFormat();
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<somee> obj = new ArrayList<somee>();
		

		EasyReader kb = new EasyReader("names.dat");
		
		EasyReader file = new EasyReader("info.dat");
		
		String read = kb.readLine();
		while(read != null)
		{
			list.add(read);
			 read = kb.readLine();
				
		}
		
		String rad = file.readLine();
		
		while(rad != null)
		{
			String[] arr = rad.split("\\,");
			
			somee oby = new somee();
			
			
			String id =arr[0];
			String first = arr[1];
			String last = arr[2];
			String phone = arr[3];
			
			oby.setID(id);
			oby.setFirst(first);
			oby.setLast(last);
			oby.setPhone(phone);
			
			obj.add(oby);
			
			rad = file.readLine();
			
		}
		
		System.out.println("Before sorting:");
		System.out.println();
		System.out.println();

		for(int x=0; x< obj.size(); x++)
		{
			System.out.println((f.format((obj.get(x).getID()), 10, 'L', 0)) + (f.format(obj.get(x).getLast(), 10, 'L', 0)) + (f.format(obj.get(x).getFirst(), 39, 'C', 0)) + (f.format(obj.get(x).getPhone(), 30, 'C', 0)));

		}
		
		for(int x=0; x< list.size(); x++)
		{
			//System.out.println(list.get(x));
		}
		
		Collections.sort(obj);
		Collections.sort(list);
		
		
	System.out.println();
	System.out.println();
	System.out.println();

	System.out.println("After sorting:");
	System.out.println();
	

	for(int x=0; x< obj.size(); x++)
	{
		
		System.out.println((f.format((obj.get(x).getID()), 10, 'L', 0)) + (f.format(obj.get(x).getLast(), 10, 'L', 0)) + (f.format(obj.get(x).getFirst(), 39, 'C', 0)) + (f.format(obj.get(x).getPhone(), 30, 'C', 0)));

	}
	
		for(int x=0; x< list.size(); x++)
		{
			//System.out.println(list.get(x));
		}
	}
}
