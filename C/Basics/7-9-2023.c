		// 1... Write C program to search element in array , it's element found or not.
//#include<stdio.h>
//int main ()
//{
//	int a[10],i,n,search;
//	int flag=1;
//	printf("Enter the size of Array\n");
//	scanf("%d",&n);
//	
//	printf("Enter the elements of array\n");
//	for(i=0; i<n; i++)
//	{
//		scanf("%d",&a[i]);
//	}
//	printf("Enter The element\n");
//	scanf("%d",&search);
//	
//	for(i=0; i<n; i++)
//	{
//		if(a[i]==search)
//		{
//			flag=0;
//			break;
//		}
//	}
//	if(flag)
//	{
//		printf("Not Found Element\n");
//	}
//	else
//	{
//		printf("Element Found");
//	}
//	return 0;	
//}


			// 2... Write C program to display the reverse array.
//#include<stdio.h>
//int main()
//{
//	int a[5],i,temp,end,len,mid;
//	printf("enter the value in array\n");
//	len = sizeof(a)/sizeof(a[0]);
//	for(i=0; i<5; i++)
//	{
//		scanf("%d",&a[i]);
//	}
//	printf("Before Reverse \n");
//	for(i=0; i<5; i++)
//	{
//		printf("\t a[%d] --  %d\n",i,a[i]);
//	}
//	mid=(len/2);
//	end=(len-1);
//	for(i=0; i<mid; i++)
//	{
//		temp = a[i];
//		a[i] = a[end];
//		a[end] = temp;
//		--end;
//	}
//	printf("After Reverse\n");
//	for(i=0; i<len; i++)
//	{
//		printf("a[%d] -- %d\n",i,a[i]);
//	}
//	return 0;
//}



