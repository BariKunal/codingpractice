#include<stdio.h>
int main()
{
	int a[2][2],b[2][2],c[2][2],i,j;
	printf("Enter The 1st Array Elements\n");
	for(i=0; i<2; i++)
	{
		for(j=0; j<2; j++)
		{
			scanf("%d",&a[i][j]);
		}
	}
	printf("Display 1st Array\n");
	for(i=0; i<2; i++)
	{
		for(j=0; j<2; j++)
		{
			printf("%d ",a[i][j]);
		}
		printf("\n");
	}
	
	printf("Enter The 2st Array Elements\n");
	for(i=0; i<2; i++)
	{
		for(j=0; j<2; j++)
		{
			scanf("%d",&b[i][j]);
		}
	}
	
	
	printf("Display 2nd Array Elements\n");
	for(i=0; i<2; i++)
	{
		for(j=0; j<2; j++)
		{
			printf("%d ",b[i][j]);
		}
		printf("\n");
	}
	
	for(i=0; i<2; i++)
	{
		for(j=0; j<2; j++)
		{
			c[i][j]=a[i][j]+b[i][j];
		}
	}
	
	printf("Addition of Two Matrices\n");
	for(i=0; i<2; i++)
	{
		for(j=0; j<2; j++)
		{
			printf("%d ",c[i][j]);
		}
		printf("\n");
	}
	return 0;
}
