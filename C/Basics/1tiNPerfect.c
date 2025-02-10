#include<stdio.h>
int main()
{
	int no,j,i,sum;
	printf("\nEnter The Number ");
	scanf("%d",&no);
	
	for(i=1; i<=no; i++)
	{
		sum=0;
		for(j=1; j<i; j++)
		{
			if(i%j==0)
			{
				sum=sum+j;
			}
		}
		if(sum==i)
		{
			printf(" Perfect Number %d ",i);
		}
	}
	return 0;
}
