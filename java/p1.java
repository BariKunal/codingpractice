/*10. Nested Loop to Print a Pattern
Write a program that prints the following pattern using nested loops:
*
**
***
****
*****

*/

public class p1
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(j<=i)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
