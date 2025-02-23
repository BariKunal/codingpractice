import java.util.*;
public class FreOfDigit_Day2
{
	public static void main(String x[])
	{
		int temp,no,rem,count;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Number :");
		no = sc.nextInt();
		
		temp=no;
		int i=0;
		while(i<=9)
		{
			count=0;
			no = temp;
			while(no!=0)
			{
				rem = no % 10;
				if(rem==i)
				{
					count++;
				}
				no = no/10;
			}
			if(count>0)
			{
				System.out.println(i+"----"+count+" times");
			}
			i++;
		}
	}
}