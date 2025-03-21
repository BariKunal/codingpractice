
//  0                 0
//  0 1             0 1
//  0 1 0         0 1 0
//  0 1 0 1     0 1 0 1
//  0 1 0 1 0 0 1 0 1 0


public class ABCPattern3
{
    public static void main(String x[])
    {
	int i,j;
	
	for(i=1; i<=5; i++)
	{
	    
	    for(j=1; j<=10; j++)
	    {
                if(j>=i+1 && j<=10-i)
		{
		    System.out.printf("  ");
		}
		else
		{
		    if(j<=5)
		    {
			if(j<=5 && j%2==1)
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
			if(j%2==0 && i%2==1)
			{
			    System.out.printf("0 ");
			}
			else
			{
			    	if(i%2==0 && j%2==1)
				{
				    System.out.printf("0 ");
				}
				else
				{
				    System.out.printf("1 ");
				}
				
			}
		    }
		}
	    }
	    System.out.println();
         }
    }
}