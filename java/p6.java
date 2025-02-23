/*
	A B C D E
	A B C D
	A B C
	A B
	A	
*/

public class p6
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			int ch = 65;
			for(int j=1; j<=5; j++)
			{
				if(j>=i)
				{
					System.out.print((char)ch+" ");
					ch++;
				}
			}
			System.out.println();
		}
	}
}