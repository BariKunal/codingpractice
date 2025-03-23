
//  **********
//  ****  ****
//  ***    ***
//  **      **
//  *        *			10 by 10
//  *        *
//  **      **
//  ***    ***
//  ****  ****
//  **********



public class DiamondPattern
{
    public static void main(String x[])
    {
	int i,j;
	
	for(i=1; i<=10; i++)
	{
	    for(j=1; j<=10; j++)
	    {
		if((j>=7-i && j<=4+i && i<=5) || (j>=i-4 && j<=15-i && i>=6))
		{
		    System.out.printf(" ");
		}
		else
		{
		    System.out.printf("*");			
		}
	    }
	System.out.printf("\n");
	}
    }
}