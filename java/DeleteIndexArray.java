import java.util.*;
public class  DeleteIndexArray
{
    public static void main(String x[])
    {
		Scanner sc = new Scanner (System.in);
		int size;
		System.out.println("Enter The Array Size :");
		size = sc.nextInt();
		int a[] = new int [size];
		int i,j;
		System.out.println("Enter The Array Elements :");		
		for(i=0 ; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
			
		System.out.println(" Array Elements");
		for(i=0; i<size; i++)
		{
			System.out.print(" "+a[i]);
		}
		
		System.out.println("\nEnter The Index ");
		int ind = sc.nextInt();
		
		for(i=ind; i<size-1; i++)
		{
			a[i] = a[i+1];
		}
		size--;
		for(i=0; i<size; i++)
		{
			System.out.print(" "+a[i]);
		}

    }
}