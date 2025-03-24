
//  1 2 3 4 5
//  2     5
//  3   5
//  4 5
//  5  


public class HollowInverHalfPyramid
{
    public static void main(String x[])
    {
	for(int i=1; i<=5; i++)
	{
	    for(int j=i; j<=5; j++)
	    {
		if( i==1 || j==i || j==5) 
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