import java.util.*;
public class SumOftwoString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First String :");
		String str1 = sc.nextLine();
		System.out.println("Enter The Second String :");
		String str2 = sc.nextLine();
		
		long s1 = Long.parseLong(str1);		// converting string by parselong
	
		long s2 = Long.parseLong(str2);		// converting string by parselong
			
		long sum = s1+s2;					// storing sum into long sum variable
		
		System.out.println("Sum is :"+sum);  // printing sum
	}
}
		