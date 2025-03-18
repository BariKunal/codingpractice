import java.util.*;
public class HappyOrNotFun
{
    public static void main(String x[])
    {
	int num;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter The Number :");
	num = sc.nextInt();
	
	Happy(num);
    }

    public static void Happy(int no)
    {
	int rem,sum;
	
	while(no!=1 && no!=4)
	{
	   sum=0;
	    while(no>0)
	    {
	  	rem = no % 10;
		sum = sum + (rem*rem);	
		no  = no / 10;
	    }
	    no=sum;	
	    
	    if(sum==1)
	    {
	        System.out.println("Happy Number...");
	    }
	    if(sum==4)
	    {
	        System.out.println("Not Happy Number...");
	    }
	}
	
    }
}