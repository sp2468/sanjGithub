package patwardhanq2;

public class scoreTest {

	public static void main(String[] args) 
	{
		
		EasyReader file = new EasyReader("scores.dat");
		
		EasyFormat format = new EasyFormat();
		
		score obj = new score();
		
		System.out.println("Summary of test score data");
		System.out.println();
		
		int x = file.readInt();
		int i = 1;
		
		while(x!=-1)
		{
			obj.addScore(x);
			System.out.print(x+" ");
			
			if(i%20==0)
			{
				System.out.println();
			}
			i++;
			x= file.readInt();
	
		}
		
		System.out.println();
		
		System.out.println("The number of scores: " + (int) obj.getnumOfScores());
		System.out.println("The number of average scores: " + (obj.gettotScores()/obj.getnumOfScores()));
		System.out.println("The maximum score: " + obj.max());
		System.out.println("The maximum score: " + obj.min());
		System.out.println("The standard deviation: " + obj.stdv());
		System.out.println();
		System.out.println("Bar chart");
		System.out.println();
		System.out.println(EasyFormat.format("10", 24, 'R', 0) + EasyFormat.format("20", 10, 'R', 0) + EasyFormat.format("30", 10, 'R', 0)+ EasyFormat.format("40", 10, 'R', 10));
		System.out.println(EasyFormat.format("|", 23, 'R', 0) + EasyFormat.format("|", 10, 'R', 0) + EasyFormat.format("|", 10, 'R', 0)+ EasyFormat.format("|", 10, 'R', 10));
		
		System.out.println(EasyFormat.format("A: ", 4, 'L', 0) + EasyFormat.format(obj.bar(obj.getA()), 50, 'L', 9));
		System.out.println(EasyFormat.format("B: ", 3, 'L', 0) + EasyFormat.format(obj.bar(obj.getB()), 50, 'L', 10));
		System.out.println(EasyFormat.format("C: ", 3, 'L', 0) + EasyFormat.format(obj.bar(obj.getC()), 50, 'L', 10));
		System.out.println(EasyFormat.format("D: ", 3, 'L', 0) + EasyFormat.format(obj.bar(obj.getD()), 50, 'L', 10));

		System.out.println(EasyFormat.format("|", 23, 'R', 0) + EasyFormat.format("|", 10, 'R', 0) + EasyFormat.format("|", 10, 'R', 0)+ EasyFormat.format("|", 10, 'R', 10));
		System.out.println(EasyFormat.format("10", 24, 'R', 0) + EasyFormat.format("20", 10, 'R', 0) + EasyFormat.format("30", 10, 'R', 0)+ EasyFormat.format("40", 10, 'R', 10));

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
