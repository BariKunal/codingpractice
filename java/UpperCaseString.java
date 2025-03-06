/*	Q1. WAP to create class name as Upper with constructor 
	Upper(char[]): this constructor can accept character array as input 
	char [] getUpperCase(): this function can convert lower cas string to upper case and return it. */ 
	
import java.util.*;
class Upper 
{
	char ch[];
	Upper(char ch[])
	{
		this.ch=ch;
	}
	char [] getUpperCase()
	{
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]>=90 && ch[i]<=122)
			{
				ch[i] = (char)((int)ch[i]-32);
			}
		
		}
		return ch;
	}
}
public class UpperCaseString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		char ch [] = new char [5];
		
		System.out.println("Enter The Characters In Array :");
		for(int i=0; i<ch.length; i++)
		{
			ch[i] = sc.next().charAt(0);
		}
		Upper u = new Upper(ch);
		char res[]= u.getUpperCase();
		System.out.println("UpperCase Characters:");
		for(int i=0; i<ch.length; i++)
		{
			System.out.println(res[i]);
		}
	}
}
