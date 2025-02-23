/*
1 2 3 4 5 4 3 2 1
  1 2 3 4 3 2 1
    1 2 3 2 1
      1 2 1
        1
*/

public class p8
{
	public static void main(String x[])
	{
		for(int i=5; i>=1; i--)
		{
			int no=1;
			for(int j=1; j<=9; j++)
			{
				if(j>=6-i && j<=4+i)
				{
					System.out.print(+no+" ");
					
					if(j<5)			// for incresing number to the middle
					{
						no++;
					}
					else			// decresing number order to the middle
					{
						no--;
					}
				}
				else
				{
					System.out.print("  ");	
				}
			}
			System.out.println();
		}
	}
}	