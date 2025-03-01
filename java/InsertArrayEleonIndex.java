/*7.WAP to create the class name as InsertArrayEle with a following methods  
class InsertArrEle 
{  int c[]; 
void setIntArray(int ch[]) 
{ //here accept the integer array and store in instance variable in integer array 
c=ch; 
} 
void insertValueOnIndex() 
{ //here we need to write the manual logics for  inserting value on specified index in arr 
} 
} 
public class ConvertToUpperApp 
{ 
} 
public static void main(String x[]) 
{  //here create the array with 6 six size and store only five value in it using scanner 
// create the object of InsertArrEle class 
//call the setIntArray function 
//call the insertValueOnIndex() and write the manual logics 
}*/

import java.util.*;
class InsertArrEle
{
	int c[];
	void setIntArray(int ch[]) 
	{
		c=ch;
	}
	void insertValueOnIndex()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Index you want to input value :");
		int ind = sc.nextInt();
		System.out.println("Enter the Value on that index :");
		int value = sc.nextInt();
		
		for(int i=(c.length-2); i>=ind; i--)
		{		
			c[i+1]=c[i];
			c[i] = value;
		}
		System.out.println("_____________________");
		for(int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
	}
}
public class InsertArrayEleonIndex
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		System.out.println("Enter the Array Elements :");
		for(int i=0; i<a.length-1; i++)
		{
			a[i] = sc.nextInt();
		}
		InsertArrEle in = new InsertArrEle();
		in.setIntArray(a);
		in.insertValueOnIndex();
	}
}