//				1 2 3 4 5
//				* * * * *
//				6 7 8 9 10
//				* * * * *
//
//#include<stdio.h>
//int main()
//{
//	int i,j;
//	for(i=1; i<=5; i++)
//	{
//		for(j=1; j<=5; j++)
//		{
//			if(i==1 || i==3 || i==5)
//			{
//				printf("* ");
//			}
//			if(i == 2)
//			{
//					printf("%d ",j);
//			}
//			if(i == 4)
//			{
//					printf("%d ",j+5);
//			}
//		}
//		printf("\n");
//	}
//	return 0;
//}


#include<stdio.h>
int main()
{
	int i,j;
	for(i=1; i<=5; i++)
	{
		for(j=5; j>=i; j--)
		{
			
			if(i>=j)
			{
				printf("%d",i);
			}
			else
			{
				
			}
		}
		printf("\n");
	}
	return 0;
}


//		1 2 3 4 5
//		A B C D
//		6 7 8
//		E F
//		9
//
//		#include<stdio.h>
//		int main()
//		{
//			int i,j,no=1,n=5,c=65;
//			for(i=1; i<=n; i++)
//			{
//				for(j=1; j<=n+1-i; j++)
//				{
//					if(i%2==1)
//					{
//						printf("%d ",no);
//						no++;
//					}
//				    if( i%2==0 )
//					{
//						printf("%c ",c);
//						c++;
//					}
//				}
//				printf("\n");
//			}
//			return 0;
//		}

