//   Q2. WAP to create class name as DigitCount with two functions .
//	 void setValue(int num): this function can accept number as parameter
//	 Int getDigitCount(): this function can count the number digit from function and return it.

import java.util.*;
class DigitCount
{	
    private int num;
    public void setValue(int no)
    {
	 num=no;
    }
    public int getDigitCount()
    {
	int count = 0;
        int temp = num;

        if (temp == 0)         // If the number is 0, it has  1 digit
	{
            return 1;
        }

        while (temp != 0)      // Counting digits by dividing the number by 10 
	{
            temp = temp / 10;
            count++;
        }
        return count;

    }
}
public class DigitCountApp
{
    public static void main(String x[])
    {
	DigitCount dc = new DigitCount();

        dc.setValue(12345);	// Set a value for num

        System.out.println("Number of digits: " + dc.getDigitCount());     // print the number of digits
    }
}