//   Q2. WAP to create class name as Rev with three functions 
//	 Void setArray(int a[]): this function can accept array as parameter 
//	 Void rev(): this function can reverse the array
//	 Void display(): this function can display the array

import java.util.*;
class Rev
{
    private int arr[],mid,end,temp,i;
    void setArray(int c[])
    {
	arr = c;
    }
    void rev()
    {
        end = arr.length-1;
	mid = end/2;
	for( i=0; i<mid; i++)	
	{
	    temp = arr[i];
	    arr[i] = arr[end];
	    arr[end] = temp;
	end--;
	}	
    }
    void display()
    {	
	System.out.println("Reverse Array :");
	for( i=0; i<arr.length; i++)
	{
	    System.out.println(" "+arr[i]);
	}
    }
}
public class ReverseArray
{
    public static void main(String x[])
    {
	Scanner sc = new Scanner(System.in);
	int i;
	int a[] = new int [5];
	System.out.println("Enter The Array Elements :");
	for( i=0; i<a.length; i++)
	{
	    a[i] = sc.nextInt();
	}
	Rev reverse = new Rev();	
	reverse.setArray(a);
	reverse.rev();
	reverse.display();
    }
}
