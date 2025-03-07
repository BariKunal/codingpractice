public class Pattern_letters
{
	public static void main(String x[])
	{
		
		for(int i=1; i<=6; i++)		//outer loop
		{
			boolean flag=true;		//boolean value
			char ch = 'A';
			for(int j=1; j<=11; j++)	//innerloop
			{
				if( j>=i && j<=12-i && flag)	//condn
				{
					System.out.print(ch);
					ch++;
					flag=false;
				}
				else
				{
					System.out.print(" ");
					flag=true;
					//break;
				}
			}
			System.out.println();		//new line
			//j<=5+i && j>=7-i ||
		}
	}
}