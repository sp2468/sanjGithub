package patwardhanq2;

import java.util.ArrayList;

public class foodTest {
	
	public static void main(String[] args)
	{
		ArrayList<food> foodie= new ArrayList<food>();
		
		final double TAX = 0.08;
		
		int y=0, h=0, k=9;
		
		EasyReader file = new EasyReader("food.dat");
		
		EasyReader kb = new EasyReader("order.dat");
		//EasyReader kb = new EasyReader();
		
	

		
		String input = file.readLine();
		
		boolean taxes = false;
		
		
		while(!input.equals("stop"))
		{
			String[] arr = input.split("\\*");
			
			 
			 String name = arr[0];
			int barcode = Integer.parseInt(arr[1]);
			double price = Double.parseDouble(arr[2]);
			
			if(arr[3].equals("T"))
			{
				taxes = true;
			}
			else {
				taxes = false;
			}
			
			food obj = new food(name, barcode, price, taxes);
			
			foodie.add(obj);
			
			
			input = file.readLine();
 
		}
		
		
		
		int read = kb.readInt();
		
		double total = 0.0;
		double trax = 0.0;
		double subtotal = 0.0;
		
		while(read != -1)
		{
			int isThere =0;
			

				for(int x= 0; x< foodie.size(); x++)
				{		
					

					if (read == foodie.get(x).getBarcode())
					{
						if( foodie.get(x).Taxe() == true)
						{
							
							total = total + ((foodie.get(x).getPrice() * TAX) + foodie.get(x).getPrice());
						}
						
						else {
						
							total = total + foodie.get(x).getPrice();
						
						}
						
						subtotal = subtotal + foodie.get(x).getPrice();

						System.out.println(foodie.get(x).getName() + " " + foodie.get(x).getPrice());
						isThere++;
					}
					
					
					
				}
				
				trax = total - subtotal;
				
				if(isThere == 0 && read != 0)
				{
					System.out.println("No product");
				}
				
				

				if(read ==0)
				{
					System.out.println();
					
					System.out.print("Subtotal is ");
					System.out.format("%.2f", subtotal);

					System.out.println();


					System.out.print("Tax is ");
					System.out.format("%.2f", trax);
					
					System.out.println();

					System.out.print("Total is ");
					System.out.format("%.2f", total);
					
					System.out.println();

					
					System.out.println();

					subtotal = 0.0;
					total = 0.0;
				}
				
			read= kb.readInt();
	
			
		}

		
	}

}
