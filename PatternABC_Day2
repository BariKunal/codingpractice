
//  A
//  A B A
//  A B C B A
//  A B C D C B A			5 by 9
//  A B C D E D C B A


public class PatternABC_Day2
{
    public static void main(String x[])
    {
		int i,j,temp=0;
		char ch;
		for(i=1; i<=5; i++)
		{
			ch= 'A';
			for(j=1; j<=9; j++)
			{
				if(j<=i+temp)
				{
					System.out.printf("%c ",ch);
					
				}
				else
				{
					System.out.printf("  ");
				}
				if(j<i)
				{
					ch++;
				}
				else
				{
					ch--;
				}
			}
			temp++;
			System.out.println();
		}
    }
}