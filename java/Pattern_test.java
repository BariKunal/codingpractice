public class Pattern_test
{
	public static void main(String x[])
	{
		for(int i=1; i<=6; i++)		//outer loop
		{
			int temp=1;
			for(int j=1; j<=6; j++)  //inner loop
			{
				if(i==1 && i<=i+temp || i==2)  //condn for i=1&2.
				{
					if(j%2==0 && j==2)
					{	
						System.out.print(i+" ");
					}
					else if(j<=2)
					{
						System.out.print("# ");
					}
					else{
						System.out.print(" ");
					}
				}
				
				if(i==3 && i<=i+temp || i==4)	//condn for i=3&4.
				{
					if(j%2==0 && j<=4 )
					{
						System.out.print(i+" ");	
					}
					else if(j<4)
					{
						System.out.print("# ");
					}
					else{
						System.out.print(" ");
					}
				}
				
				if(i==5 && i<=i+temp || i==6)	//condn for i=5&6.
				{
					if(j%2==0 && j<=6 )
					{
						System.out.print(i+" ");	
					}
					else if(j<6)
					{
						System.out.print("# ");
					}
					else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();		//new line
			temp++;
		}
	}
}