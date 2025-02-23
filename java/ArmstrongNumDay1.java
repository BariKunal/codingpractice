// Q2. Write a java program to check whether number is Armstrong or not.

import java.util.*;
public class ArmstrongNumDay1
{
	public static void main(String x[])
	{
		int no,temp,rem,sum=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Number :");
		no = sc.nextInt();
		
		temp = no;
		int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
		
		int originalNum = no;
		
		System.out.println("Temp ="+temp);
		while (no > 0) {
            rem = no % 10; 	// Get the last digit
            int digitPower = 1;		// Calculate digit^numDigits manually
            
			for (int i = 0; i < count; i++) 
			{
                digitPower = digitPower * rem;
            }

            sum = sum + digitPower;
            no /= 10; 	// Remove the last digit
        }
		
		
		if(originalNum==sum)
		{
			System.out.println("Number Is Armstrong...");
		}
		else
		{
			System.out.println("Number Is Not Armstrong...");
		}
	}
}