// Q4. WAP to create class name as Palimdrome with two functions 
//     void setValue(int no): this function can accept number as parameter 
//     Boolean isPalim(): this function can check if the number is palindrome or not if palindrome returns true otherwise return false.


class Palimdrome
{
    private int num;
    public void setValue(int no)
    {
	num = no;
    }
    public Boolean isPalim()
    {
	int temp = num;
	int rem,rev=0;
	while(num!=0)
	{
	    rem = num % 10;
	    rev = rem + (rev * 10);
	    num = num / 10;
	}
	
	if(temp==rev)
	{
	    return true;
	}
	else
	{
	    return false;	
	}
    }
}
public class PalimdromeApp
{
    public static void main(String x[])
    {
	Palimdrome pali = new Palimdrome();
	
	pali.setValue(121);
		
	System.out.println(pali.isPalim());
    }
}