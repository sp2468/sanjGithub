package patwardhanq2;

import java.util.ArrayList;
import java.util.Collections;

public class premTest {
	
	public static void main (String[] args)
	{
		ArrayList<Premiums> prem = new ArrayList<Premiums>();
		ArrayList<CustOMr> customer = new ArrayList<CustOMr>();

		
		
		EasyReader kb = new EasyReader("prem.dat");
		EasyReader file = new EasyReader("customer.dat");
		
		String read = kb.readLine();
		
		
		
		while(read != null)
		{
			String[] arr = read.split("\\*");
			
			int age = Integer.parseInt(arr[0]);
			int premium = Integer.parseInt(arr[1]);
			
			Premiums myobj = new Premiums(age, premium);
			
			prem.add(myobj);
			
			read = kb.readLine();
			
		}
		
		String look = file.readLine();
		while(look!= null)
		{
			String[] arr = look.split("\\*");
			String last = arr[0];
			String first = arr[1];

			int age = Integer.parseInt(arr[2]);
			
			CustOMr cast = new CustOMr(last, first, age);
			
			customer.add(cast);
			
			look = file.readLine();
		}
		
		System.out.println("Unsorted data:");
		

		for(CustOMr hi: customer)
		{
			System.out.println(hi.getLast() + ", " + hi.getFirst() + " " + hi.getAge());
		}
		
		System.out.println();
		System.out.println("Sorted Data:");

		Collections.sort(customer);
		
		for(CustOMr hi: customer)
		{
			System.out.println(hi.getLast() + ", " + hi.getFirst() + " " + hi.getAge());
		}
	
		Premiums premmy = new Premiums();
		System.out.println();

		System.out.println("Premium table:");
		

		
		
		for(int x=0; x< customer.size(); x++)
		{
			 

			Premiums dummy = new Premiums(customer.get(x).getAge(), 0);
			
			
			int loc = Collections.binarySearch(prem, dummy);
		
			if(loc < 0)
			{
				loc = -loc -1;
			}
			
				
			System.out.println(customer.get(x).getLast() +", "  +  customer.get(x).getFirst() + " " + customer.get(x).getAge() + " " +prem.get(loc).getPrem());

		
		}
		
	}

}
