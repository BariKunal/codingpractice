//     Q1.Write a menu driven program in java using function recursion.
      
//	Case 1.  Check Number Is Prime Number return true otherwise return false.
//	Case 2. Check Number Is Perfect Number return true otherwise return false.
//	Case 3. Check Number Is Duck Number return true otherwise return false.
//	Case 4. Check Number Is Strong Number return true otherwise return false.
//	Case 5. Check Number Is Armstrong Number return true otherwise return false.

import java.util.*;
public class SwitchRecursion
  {
     static int count=0,i=1,sum=0,rem,temp;
     
     public static boolean IsPrime(int no)    // 1: To check the number is prime or not and return true & false.
     {
	
	if(i<=no)
	{
	    if(no%i==0)
	    {
		count++;	
	    }
	    i++;
	    IsPrime(no);
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
    
    public static boolean IsPerfect(int no)    // 2: To check the number is Perfect or not and return true & false.
    {
	//int sum=0,i=1;
	if(i<no)
	{
	    if(no%i==0)
	    {
		sum = sum+i;
	    }
	    i++;
	    IsPerfect(no);
	}
	
	if(sum==no)
	{
	    return true;
	}
	else
	{
	    return false;
	}
	
    }

    public static boolean IsDuck(int no)   // 3: To check the number is Duck or not and return true & false.
    {
	int rem=0;
	
	boolean flag=false;
	if(no!=0)
	{
	    rem = no % 10;
	     no = no / 10;
	    if(rem==0)
	    {
		flag=true;
		//break;
  	    }
	   
	    IsDuck(no);
	}
	
	if(flag)
	{
	    return true;
	}
	else
	{
	    return false;
	}
	
    }

    public static boolean IsStrong(int no)  // 4: To check the number is Strong or not and return true & false. 1st seperate digits 2nd calculate factorial and check sum is = to number..
    {
	int fact;
	temp=no;
	if(no!=0)
	{
	    rem = no % 10;
	    fact = 1;
	    no/=10;
		int i=1;
		while(i<=rem)
		{
		    fact = fact * i;
		    i++;	
		   
		}
		
		sum = sum + fact; 
	 IsStrong( no);
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

    public static boolean IsArmstrong(int no)  // 5: To check the number is Armstrong or not and return true & false.
    {
	//int rem,sum=0;
	int temp=no;
	if(no!=0)
	{
	    rem = no % 10;
	    sum = sum + (rem*rem*rem);
	    no/=10;

	    IsArmstrong(no);
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

    public static void main(String x[])    // Main Fuction declaration and calling function is here..
    {
           Scanner xyz=new Scanner(System.in);
           int num,choice;
	   boolean res;
               do
                {
                    System.out.println("1: Prime Number");
                    System.out.println("2: Perfect Number");
                    System.out.println("3: Duck Number");
                    System.out.println("4: Strong Number");
                    System.out.println("5: Armstrong Number");
		    System.out.println("6: Exit...");

                    System.out.println("Enter choice");
                    choice=xyz.nextInt();	
		      			
                      switch(choice)
                       {
                           case 1:
                              {
      	                        System.out.println("Enter The Number");
	                        num = xyz.nextInt();  				
				res = IsPrime( num);
				System.out.println(res);
				   }                           
                             break;
                           case 2:
                      		{
	                         System.out.println("Enter The Number");
	                         num = xyz.nextInt();
				 boolean result = IsPerfect(num);
				 System.out.println(result);
	                                                         
				}
                             break;
                           case 3:
                                 {
 				 System.out.println("Enter The Number");
	                         num = xyz.nextInt();
	                         res = IsDuck( num);
				 System.out.println(res);
                                  
				}
                             break;
                           case 4:
                               {
	                         System.out.println("Enter The Number");
	                         num = xyz.nextInt();
	                         res = IsStrong( num);
				 System.out.println(res);                                    
				}
                             break;

			   case 5:
                               {
	                         System.out.println("Enter The Number");
	                         num = xyz.nextInt();
	                         res = IsArmstrong( num);
				 System.out.println(res);                                    
				}
                             break;

                           default:
                            
                                   System.out.println("Invalid input");
                            
                       }
               
                }while(choice<6);
     }
}