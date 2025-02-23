#include<stdio.h>
int main()
{
	int no,i,sum,rem,temp;
//	printf("Enter The Number ");
//	scanf("%d",&no);
//	temp=no;

	for(i=1; i<=1000; i++)
	{
		sum=0;
		no=i;
		temp=i;
			while(no>0)
			{
				rem = no%10;
				sum = sum + (rem*rem*rem);
				no  = no/10;
//				sum = sum + (rem*rem*rem);
//				count++;
			}
			if(sum==temp)
			{
				printf("\n Armstrong Numbers %d ",temp);
			}
	}
	return 0;
}
