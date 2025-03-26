 //         1
 //       2 3 2
 //     3 4 5 4 3
 //   4 5 6 7 6 5 4
//  5 6 7 8 9 8 7 6 5


public class NumberFullPyramid
{
    public static void main(String x[])
    {
	int i,j,no;
	for(i=1; i<=5; i++)                                 
	{
	    no=i;
	    for(j=1; j<=9; j++)
	    {
		if(j<=4+i && j>=6-i)
		{
		    System.out.printf(" "+no);
		    if(j<5)
		    {
			no++;
                    }
		    else
		    {
			no--;
		    }
		}
		else
		{
		    System.out.printf("  ");
		}
	    }
	        
	System.out.println();
	}
    }
}