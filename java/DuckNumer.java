//   Q3.WAP to create class name DuckNum with two methods 
//	Void setValue(int no): this function can accept number parameter 
//	boolean isDuck(): this function can check number is duck or not if number is duck return true otherwise return false.

class DuckNum
{
    private int num;
    public void setValue(int no)
    {
	num = no;
    }
    public boolean isDuck()
    {
	int rem;
	Boolean flag=false;
	while(num != 0)
	{ 
	    rem = num % 10;
	    num = num / 10;
	       if(rem == 0)
	       { 
		  flag = true;
		  break;
 	       }
	       else
		{	
		   flag = false;
		}
	    
	}
	if(flag)
	    return true;
	else
	    return false;
    }
}
public class DuckNumer
{
    public static void main(String args [])	
    {
	DuckNum dk = new DuckNum();
	
	dk.setValue(1908);
	
	System.out.println(dk.isDuck());
    }
}