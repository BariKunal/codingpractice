//#include<stdio.h>
//int main()
//{
//	int a[5],temp,i,j;
//	int len = sizeof(a)/sizeof(a[0]);
//	printf("Enter The Array Element\n");
//	
//	for(i=0; i<5; i++)
//	{
//		scanf("%d",&a[i]);
//	}
//	for(i=0; i<len; i++)
//	{
//		for(j=0; j<i; j++)
//		{
//			if(a[i]<a[j])
//			{
//				temp=a[i];
//				a[i]=a[j];
//				a[j]=temp;
//			}
//		}
//	}
//	printf("Ascending Array\n");
//	for(i=0; i<len; i++)
//	{
//		printf("%d \n",a[i]);
//	}
//	
//					// for descending order
//	for(i=0; i<len; i++)
//	{
//		for(j=0; j<i; j++)
//		{
//			if(a[i]>a[j])
//			{
//				temp=a[i];
//				a[i]=a[j];
//				a[j]=temp;
//			}
//		}
//	}
//	printf("Descending Array\n");
//	for(i=0; i<len; i++)
//	{
//		printf("%d \n",a[i]);
//	}
//	return 0;
//}

	
					//  2... Write a C program check whether Array majority or not.
			
//#include<stdio.h>
//int main()
//{
//	int a[5],i,j,len,count;
//	len = sizeof(a)/sizeof(a[0]);
//	int mid = (len/2);
//	printf("Enter The Array Element\n");
//	for(i=0; i<5; i++)
//	{
//		scanf("%d",&a[i]);
//	}
//	int flag=0,f=0;
//	for(i=0; i<5; i++)
//	{
//		count=1;
//		flag=0;
//		for(j=i+1; j<5; j++)
//		{
//			if(a[i]==a[j])
//			{
//				count++;
//				
//				if(count>=mid)
//				{
//					flag=1;
//					break;
//				}
//			}
//		}
//		if(flag)
//		{
//			f=1;
//			break;
//		}
//		
//	}
//	if(f)
//		{
//			printf(" Array is Majority %d \n",a[i]);
//		}
//		else
//		{
//			printf("Not Majority\n");
//		}
//	return 0;
//}



				// 3... check array is pallindrome or not.
//#include<stdio.h>
//int main()
//{
//	int i,j,flag,end,n,a[10];
//	printf("Enter the size of array\n");
//	scanf("%d",&n);
//
//	printf("Enter the element of array:\n");
//	for(i=0; i<n; i++)
//	{
//		scanf("%d",&a[i]);
//	}
//	
//	printf("\nDisplay Array");
//	for(i=0; i<n; i++)
//	{
//		printf("%d  ",a[i]);
//	}
//	
//	end=n-1;
//	flag=1;
//	for(i=0; i<end; i++)
//	{
//		if(a[i]!=a[end])
//		{
//			flag=0; 
//			break;
//		}
//		--end;
//	}
//	if(flag)
//	{
//		printf("\nArray is Pallindrome\n");
//	}
//	else
//	{
//		printf("\nArray is Not Pallindrome\n");
//	}
//	return 0;
//}
					

				//  5... Write C program to find pair with given sum in array.
//#include<stdio.h>
//int main()
//{
//	int a[10],i,n,j,sum;
//	printf("Enter the Size of Array\n");
//	scanf("%d",&n);
//	
//	printf("Enter The Element of Array\n");
//	for(i=0; i<n; i++)
//	{
//		scanf("%d",&a[i]);
//	}
//	printf("Enter the Sum\n");
//	scanf("%d",&sum);
//	for(i=0; i<n; i++)
//	{
//		for(j=i+1; j<n; j++)
//		{
//			if(a[i]+a[j]==sum)
//			{
//				printf("\n a[%d]  a[%d]",a[i],a[j]);
//			}
//		}
//	}
//	return 0;
//}					
