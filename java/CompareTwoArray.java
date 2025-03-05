/*Q2. WAP to Compare with two array
Compare(int a[],int b[]): this constructor can accept two array as parameter of type integer 
Compare(char[],char[]): this constructor can accept two character array 
Boolean  isIntegerArrayEqual(): this function can compare two integer array and if both array data is equal return true otherwise return false if function return true then show the message integer array are equal otherwise not equal
Boolean isCharArrayEqual(): this function can compare two character array and if both array data is same return true otherwise return false if function return true then show message character array equal otherwise not*/

import java.util.*;
class Compare
{
	int a[],b[];
	
	Compare(int a[],int b[])
	{
		this.a=a;
		this.b=b;
	}
	Boolean  isIntegerArrayEqual()
	{
		if(a.length != b.length)
		{
			return false;
		}
		for(int i=0; i<a.length; i++)
		{	
			if(a[i] != b[i])
			{
				return false;
			}
		}
		return true;
		
	}
}

class Compaire
{
	char m[],n[];
	Compaire(char m[],char n[])
	{
		this.m=m;
		this.n=n;
	}
	Boolean isCharArrayEqual()
	{
		if(m.length != n.length)
		{
			return false;
		}
		for(int i=0; i<m.length; i++)
		{
			if(m[i] != n[i])
			{
				return false;
			}
		}
		return true;
	}
}
public class CompareTwoArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		
		System.out.println("Enter The 1st Array Elements :");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		int b[] = new int[3];
		System.out.println("Enter The 2nd Array Elements :");
		for(int i=0; i<b.length; i++)
		{
			b[i] = sc.nextInt();
		}
		Compare co1 = new Compare(a,b);
		if (co1.isIntegerArrayEqual())
		{
			System.out.println("The arrays are equal.");
        } 
		else 
		{
			System.out.println("The arrays are not equal.");
		}
		
		
		char m[] = new char[3];
		for(int i=0; i<m.length; i++)
		{
			m[i] = sc.next().charAt(0);
		}
		char n[] = new char[3];
		System.out.println("Enter The 2nd Array Elements :");
		for(int i=0; i<n.length; i++)
		{
			n[i] = sc.next().charAt(0);
		}
		Compaire co = new Compaire(m,n);
		if (co.isCharArrayEqual())
		{
			System.out.println("The arrays are equal.");
        } 
		else 
		{
			System.out.println("The arrays are not equal.");
		}
	}
}