package patwardhanq2;

public class CustOMr  implements Comparable<CustOMr>{

	private String last;
	private String first;

	private int age;
	
	public CustOMr()
	{
		last = "";
		first = "";
		age = 0;
		
	}
	
	
	public CustOMr(String last, String first, int age)
	{
		this.last = last;
		this.first = first;	
		this.age = age;

		
		
	}
	
	public String getFirst()
	{
		return first;
	}
	
	public String getLast()
	{
		return last;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int compareTo( CustOMr otherPers)
	{
		int ans =0;
		
		String both = "" + first + last;
		String oth = "" + otherPers.first + otherPers.last;
		
		if(last.compareToIgnoreCase(otherPers.last) ==0)
			{
				if(first.compareToIgnoreCase(otherPers.first) ==0)
				{
					ans =0;
				}
				
				if(first.compareToIgnoreCase(otherPers.first) >0)
				{
					ans =1;
				}
				
				if(first.compareToIgnoreCase(otherPers.first) <0)
				{
					ans =-1;
				}
				
				
			}
		else if(last.compareToIgnoreCase(otherPers.last) >0)
		{
			
			ans =1;
		}
		
		else if(last.compareToIgnoreCase(otherPers.last) <0)
		{
			
	
			ans =-1;
		}
		
	return ans;
	}
	
	
	
}
