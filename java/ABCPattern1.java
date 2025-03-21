
//  A
//  B C
//  D E F
//  G H I J
//  K L M N O




public class ABCPattern1
{
    public static void main(String x[])
    {
	int i,j;
	char ch='A';
	for(i=1; i<=5; i++)
	{
	    for(j=1; j<=5; j++)
	    {
		if(i>=j)
		{
		    System.out.printf("%c ",ch);
		    ch++;
		}
		
	    }
	System.out.println();
	}
    }
}