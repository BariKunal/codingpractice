#include<stdio.h>
int main()
{
	int no,i,j,fact,sum,rem;
	printf("\n Enter The Number ");
	scanf("%d",&no);
	
	for(i=1; j<no; i++)
	{
		sum=0;
		
		while(no>0)
		{
			rem = no%10;
			fact = 1;
			
			for(j=rem; j>=1; j--)
			{
				fact = fact * j;		
			}
			sum = sum+fact;
			no = no/10;
		}
		if(no==sum)
		{
			printf("Strong Numbers %d ",no);
		}
	}
	return 0;
}
