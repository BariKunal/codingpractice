// Hollw Half Pyramid.

public class FullPyramid
{
    public static void main(String x[])
    {
	for(int i=1; i<=5; i++)
	{
	    for(int j=1; j<=5; j++)
	    {
		if( j==1 || j==i || i==5) 
		{
		   System.out.printf("%d ",j);
		}
		else{
		   System.out.print("  ");
		}
  	    }
	System.out.println();
	}
    }
}