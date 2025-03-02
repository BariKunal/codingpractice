// Q3. WAP to create class name as Prime with two functions 
//     void setValue(int no): this function can accept number as parameter 
//     boolean isPrime(): this function can check if the number is prime or not if prime return true otherwise return false.


class Prime
{
    private int num;
    public void setValue(int no)
    {
	num=no;
    }
    public boolean isPrime()
    {
	int i=1;
	int count=0;
	while(i<=num)
	{
	    if(num%i==0)
	    {
		count++;
	    }
	    i++;
	}
	if(count==2)
	{
	    return true;
	}
	else
	{
	    return false;
	}
    }
}
public class PrimeObject
{
    public static void main(String x[])
    {
	Prime pm = new Prime();
	pm.setValue(7);
	
	System.out.println(pm.isPrime());     
    }
}