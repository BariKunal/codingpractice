import java.util.*;
public class UserSizeArray
{
    public static void main(String x[])
    {
	Scanner sc = new Scanner(System.in);
	int temp,i,j,size;
	System.out.println("Enter The Size of Array :");
	size = sc.nextInt();
	int a[] = new int [size+1];
	System.out.println("Enter The Array Elements :");
	for(i=0; i<size; i++)
	{
	    a[i] = sc.nextInt();	
	}
	System.out.println("Array Elements :");
	for(i=0; i<size; i++)
	{
	    System.out.print("\t"+a[i]);	
	}
    }

}