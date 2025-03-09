// 4. Write a java program to print all even numbers between 1 to 100.


import java.util.Scanner;
public class EvenHUNRecursion
{
	static int i=1;
    public static void main(String x[])
    {
	EvenNumber(100);
    }
    public static void EvenNumber(int no)
    {
	if(i<=100)
	{
	    if(i%2==0)
	    {
	       System.out.println(i);
	    }
	    i++;	
	    EvenNumber(no);
	}
    }
} 