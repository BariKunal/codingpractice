// Q4. WAP to create function name as boolean isArmstrong(int no) : this function can accept number as parameter and check number is Armstrong or not 
// if Armstrong then return true otherwise return false.

import java.util.*;
public class ArmsReturnFun
{
    public static void main(String x[])
    {
	Scanner sc =  new Scanner (System.in);
	int num;
	System.out.println("Enter The Number: ");
	num = sc.nextInt();
	
	boolean res = IsArm( num);
  	
	System.out.println(res);
    }

    public static boolean IsArm(int no)
    {
	int rem,sum=0,temp;
	temp=no;
	while(no!=0)
	{
	    rem = no % 10; 
	    sum = sum + (rem*rem*rem);
	    no = no / 10;
	}
	if(sum==temp)
	{
	    return true;
	}
	else
	{
	    return false;
	}
    }
}