//  Q4. WAP to create class name as PrintPattern with two methods 
//	Void setValue(int row,int col): this function can accept row and column for pattern
//	Void printPattern(): this function can print the following pattern

//	*
//	**
//	***
//	****
//	*****


class PrintPattern
{
    private int r,c;
    public void setValue(int row,int col)
    {
	r = row;
	c = col;
    }
    public void printPattern()
    {
	for(int i=0; i<r; i++)
	{
	    for(int j=0; j<c; j++)
	    {
		if(i>=j)
		{
 	 	    System.out.print("*");
		}
 	    }
	    System.out.println();
	}
    }
}
public class PrintPatternApp
{
    public static void main(String args [])
    {
	PrintPattern pattern = new PrintPattern();
	
	pattern.setValue(5,5);
	pattern.printPattern();
    }
}