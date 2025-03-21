
//  1                 0
//  1 0             1 0
//  1 0 1         0 1 0			// 5 by 10
//  1 0 1 0     1 0 1 0
//  1 0 1 0 1 0 1 0 1 0




public class ABCPattern2
{
    public static void main(String x[])
    {
	int i,j;
	
	for(i=1; i<=5; i++)
	{
	    
	    for(j=1; j<=10; j++)
	    {
		if( i>=j || j>=11-i)
		{
		    if(j%2==0)
		    {
		        System.out.printf("0 ");
		    }
		    else
		    {   
			System.out.printf("1 ");
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