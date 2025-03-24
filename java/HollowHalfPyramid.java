// Hollw Half Pyramid.


//  1
//  1 2
//  1   3
//  1     4
//  1 2 3 4 5



public class HollowHalfPyramid
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