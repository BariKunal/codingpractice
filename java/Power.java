// WAP to input base and index from keyboard and calculate its power using recursion 

import java.util.Scanner;
public class Power
{
    static int i=1,p=1;
    public static void main(String x[])
    {
	int base,ind;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Base & Index :");
	base=sc.nextInt();
	ind=sc.nextInt();

	Pow(base,ind);
    }
    public static void Pow(int x,int y)
    {
	if(i<=y)
	{
	    p = x * p;
	    i++;
	
	    Pow(x,y);
	}
	System.out.println(p);
    }
}