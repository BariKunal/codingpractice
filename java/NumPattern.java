public class NumPattern
{
	public static void main(String x[])
	{	
		int i,j;
		for(i=1; i<=9; i++)
		{
			for(j=1; j<=5; j++)
			{
				if(i<=j){
					System.out.print(i);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}