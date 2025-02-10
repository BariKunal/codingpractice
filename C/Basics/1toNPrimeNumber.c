//  1 to Nth Prime numbers

#include<stdio.h>
int main()
{
	int no,i,j,count;
	printf("\n Enter The Number ");
	scanf("%d",&no);
	
	//	printf("%d Prime Number ",no);
	for(i=2; i<=no; i++)
	{
		count=0;
		for(j=2; j<i; j++)
		{
			if(i%j==0)
			{
				//printf(" Prime Number %d ",i);
				count++;
			//	break;
			}
			
		}
		if(count==0)
		{
			printf("%d ",i);
		}
	}
	return 0;	
}
