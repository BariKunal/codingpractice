
//      *
//     * *
//    *   *
//   *     *
//  *       *		   10 by 10
//  *       *
//   *     *
//    *   *
//     * *
//      *


public class DiamondHollowPattern
{
    public static void main(String x[])
    {
	int i,j;
	
	for(i=1; i<=10; i++)
	{
	    for(j=1; j<=10; j++)
	    {
		if(i<=5)
		{
		    if(j==6-i || j==4+i)
		    System.out.printf("*"); 
		    else
		    System.out.printf(" ");   
		}
		 
		else
		{	
		    if(j==i-5 || j==15-i)
		    {
			System.out.printf("*");
		    }	
		    else
		    {
			System.out.printf(" ");
		    }		
		}
	    }
	    System.out.printf("\n");
	}
    }
}