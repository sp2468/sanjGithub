package patwardhanq2;

public class FindTest 
{
	public static void main (String [] args)
	{
		EasyReader cust = new EasyReader("cust.dat");
		EasyReader apar = new EasyReader("apar.dat");
		EasyFormat f = new EasyFormat();


		Customer customer = new Customer(cust.readLine());
		
		int bluff = Integer.parseInt(apar.readLine());

		
		
		
		String as = "";
		
		
		System.out.println("For: "+customer.getName());
		System.out.println(f.format("Address", 20,'L',0)+f.format("Number of Matches",20,'L',0)+f.format("% Response",15,'L',0));
		System.out.println(f.format("-------------------",20,'L',0)+f.format("------------------",20,'L',0)+f.format("-----------",20,'L',0));
		
		System.out.println();
		Apartment[] arr2 = new Apartment[bluff];
		
		
		
		for(int x = 0; x < bluff; x++)
		{
			arr2[x] = new Apartment(apar.readLine());
		
			int per = customer.compare(arr2[x].getArr2());
			String resp ="";
			if((int)((per+ 0.0)/ 30 * 100) > 80) //for comparing the percents
			{
				resp = "Possible";
			}
			else
			{
				resp = "Not Possible";
			}
			
			if(resp.equals("Possible"))
			{
			
			System.out.println(f.format(arr2[x].getAdress(),28,'L',0)+f.format(per+"",12,'L',0)+f.format(resp,20,'L',0));
			
			}
			//}
		}
			
		
		
		

		
		
			



		
	}
}