//  Q2. WAP to create class name FindDigit with two methods 
//	Void setValue(int value): this function can accept value parameter 
//	Boolean isDigitPresent(int digit): this function can search digits in value which we pass in the setValue() function and if digit present returns true otherwise return false.

class FindDigit
{
    private int num;
    public void setValue(int value)
    {
	num = value;
    }
    public boolean isDigitPresent(int digit)
    { 
	int rem,temp,count =1;
	boolean flag = false;
 	temp = num;
	
	while(num!=0)
	{
	    rem = num % 10;
	    if(rem==digit)
	    {
		return true;	
	    }
	    num = num / 10;   
	}
	return false;
	
    }
}
public class FindDigitApp
{
    public static void main(String args [])
    {
	FindDigit fd = new FindDigit();
	
	fd.setValue(123456);
	
	//fd.isDigitPresent(3);
	
	System.out.println(" "+fd.isDigitPresent(3));
	System.out.println(" "+fd.isDigitPresent(7));
    }
}

