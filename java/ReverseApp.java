//     13/11/2024.

// Q1. WAP to create class  name Rev with two methods 
//     Void setNum(int no): this function can accept number as parameter 
//     Int getRev(): this function can reverse the number and return it 

class Rev
{
    private int num;
    public void setNum(int no)
    {
	num = no;
    }
    public int getRev()
    {
	int rem,rev=0;
	while(num!=0)
	{
	    rem = num % 10;
	    rev = rem + (rev * 10);
	    num = num / 10;	
	}
	return rev;
    }
}
public class ReverseApp
{
    public static void main(String args [])
    {
	Rev reverse = new Rev();
	reverse.setNum(12345);
	int res = reverse.getRev();
	
	System.out.println(+res);
    }
}