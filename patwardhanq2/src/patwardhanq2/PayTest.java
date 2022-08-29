package patwardhanq2;

import java.util.ArrayList;
import java.util.Collections;

public class PayTest {
	
	public static void main(String[] args)
	{
		ArrayList<Paymaster> employee = new ArrayList<Paymaster>();
		EasyFormat f = new EasyFormat();
		
		EasyReader file = new EasyReader("company.dat");
		EasyReader kb = new EasyReader("work.dat");

		
		String read = file.readLine();
		
		while(read!= null)
		{
			String[] arr = read.split("\\*");
			
			String last = arr[0];
			String first = arr[1];
			double rate = Double.parseDouble(arr[2]);
			int dep = Integer.parseInt(arr[3]);
			
			Paymaster paying = new Paymaster(last, first, rate, dep);
			employee.add(paying);
			
			read = file.readLine();

		}
		Collections.sort(employee);
		
	System.out.println(f.format("Employee", 20, 'L', 0) + f.format("Pay Rate", 20, 'L', 0) + f.format("Dependents", 20, 'L', 0) + f.format("Hours", 20, 'L', 0) + f.format("Gross", 20, 'L', 0) + f.format("Net", 20, 'L', 0));
	System.out.println();

		String rad = kb.readLine();
		
		
		while(rad != null)
		{
			String[] arr = rad.split("\\*");
			String last = arr[0];
			String first = arr[1];
			int hours = Integer.parseInt(arr[2]);
			
		
			
			Paymaster temp = new Paymaster(last, "", 0, 0);
		
			int loc = Collections.binarySearch(employee, temp);
			
			if(loc < 0)
			{
				loc = -loc -1;
			}
			
			
			System.out.print(f.format(employee.get(loc).getLast() + " " +employee.get(loc).getFirst(), 20, 'L',0)+ f.format("" +employee.get(loc).getRate(), 20, 'L', 0) +  f.format("" +employee.get(loc).getDep(), 20, 'L', 0) +  f.format("" + hours, 20, 'L', 0) );
		
			System.out.format("%.2f", employee.get(loc).calGross(employee.get(loc).getRate(), hours));

			System.out.print(f.format("", 13, 'C', 15));
			
			System.out.format("%.2f", employee.get(loc).calcNet(employee.get(loc).getRate(), hours, employee.get(loc).getDep(), employee.get(loc).calGross(employee.get(loc).getRate(), hours) ));
			System.out.println();

			
			
			
			rad = kb.readLine();
			
		}
		
		
		
	}

}
