// 3. Write a java program to print all alphabets from a to z.

import java.util.Scanner;
public class AtoZAlphaRecursion
{
	static char ch='a';
    public static void main(String x[])
    {
		
	AtoZ(ch);
    }
    public static void AtoZ(char ch)
    {
	if(ch>='a' && ch<='z')
	{
	    System.out.printf("%c ",ch);
	    ch++;
	 	
	    AtoZ(ch);
	
	}
    }
}