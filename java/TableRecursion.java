// 9. Write a java program to print multiplication table of any number.

import java.util.Scanner;
public class TableRecursion
{
	static int i=1;
    public static void main(String x[])
    {
	int no;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the Number :");
	no = sc.nextInt();
	
	TableNumber(no);
    }
    public static void TableNumber(int x)
    {
	if(i<=10)
	{
	    System.out.println(x*i);
	    i++;
	 	
	    TableNumber(x);
	
	}
    }
}