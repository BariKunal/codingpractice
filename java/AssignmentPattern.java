
//  A B C D E
//  B C D E F
//  C D E F G
//  D E F G H
//  E F G H I
//  F G H I J

public class AssignmentPattern
{
    public static void main(String x[])
    {
	int i,j;
      for(i=0; i<6; i++)
	{
	   int ch=65+i;
	    for(j=0; j<5; j++)
	    {
	    	System.out.printf("%c ",ch);
		ch++;
	    }
	    System.out.println(); 
	}
    }
}
