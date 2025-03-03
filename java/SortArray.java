//   Date: 15/11/2024
//	Q. How to pass an array as a parameter in a function?

//	Program
//	Q1. WAP to class name as Sort with two methods 
//	    void acceptArray(int a[]): this function is used for accept array as parameter
//	    Void sortArray(): this function can sort array and display it.




import java.util.*;	
class Sort
{
    private int arr[];
    void acceptArray(int w[])
    {
	arr = w;
    }
    void sortArray()
    {
	int temp;
	for(int i=0; i<arr.length; i++)
	{
	    for(int j=i+1; j<arr.length; j++)
	    {
		if(arr[i] > arr[j])
		{	
		    temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		}
	    }
	}
	System.out.println("After Sorted Array :");
	for(int i=0; i<arr.length; i++)
	{	
	    System.out.println(" "+arr[i]);
	}
    }

}
public class SortArray
{
    public static void main(String x[])
    {
	Scanner sc = new Scanner (System.in);
	int a[] = new int [5];
	System.out.println("Enter The Array Elements :");
	for(int i=0; i<a.length; i++)
	{	
	    a[i] = sc.nextInt();
	}
	
	Sort Sarray = new Sort();
	Sarray.acceptArray(a);
	Sarray.sortArray();
    }
}