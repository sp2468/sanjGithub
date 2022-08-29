package patwardhanq2;

public class Customer 
{
	private String name;
	private char[] arr1; //the guys preference
	
	public Customer(String vodma)
	{
	 name= vodma.substring(30);
	 String temp = vodma.substring(0,30);
	 arr1 = new char[30]; 
	 //this is gonna read my chars :)
		for(int x = 0; x < arr1.length; x++)
		{
			arr1[x] = temp.charAt(x);		
		}
	}

	public String getName()
	{
		return name;
	}
	
	public char[] getArr1()
	{
		return arr1;
	}

	public int compare(char[] arr2)
	{
		int counta = 0;
		for(int x= 0; x < arr2.length; x++)
		{
			if(arr1[x] == arr2[x])
			{
				counta++;
			}
		}
		
		return counta;
	}
		
}
