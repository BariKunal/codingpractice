import java.util.*;
public class ElectricityBill1
{
    public static void main(String z[])
    {
	
        double u,netbill,total;
	Scanner sc = new Scanner (System.in);
	System.out.printf("Enter The Unit ");
	u = sc.nextDouble();
	
	if(u>=0 && u<=50)
	{
	    netbill= u*0.50;
	    total = netbill+(netbill*20)/100;
	    System.out.println("Total Bill Is = "+total);
	}
	else if(u>50 && u<=150)
	{
	    netbill = u*0.75;
	    total = netbill+(netbill*20)/100;
	    System.out.println("Total Bill Is  = "+total);
	}
	else if(u>150 && u<=250)
	{
	    netbill = u*1.20;
	    total = netbill+(netbill*20)/100;
	    System.out.println("Total Bill Is  = "+total);
	}
	else if(u>250 )
	{
	    netbill = u*1.50;
	    total = netbill*20/100;total = netbill+(netbill*20)/100;
	    System.out.println("Total Bill Is  = "+total);
	}
	else
	{
	     System.out.printf("Invalid....");

	}


    }
}