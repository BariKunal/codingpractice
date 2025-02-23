//    1..Write a program merge two array and display it

//#include<stdio.h>
//int main()
//{
//	int a[3],b[3],i,len1,len2,len3;
//	printf("Enter the value in 1 array\n");
//	for(i=0; i<3; i++)
//	{
//		scanf("%d",&a[i]);
//	}
//	printf("Enter the value in 2 array\n");
//	for(i=0; i<3; i++)
//	{
//		scanf("%d",&b[i]);
//	}
//	len1=sizeof(a)/sizeof(a[0]);
//	len2=sizeof(b)/sizeof(b[0]);
//	len3=len1+len2;
//
//	printf("len1= %d len2= %d len3= %d\n",len1,len2,len3);
//	int merge[len3];
//	for(i=0; i<len1; i++)
//	{
//		merge[i]=a[i];
//		merge[i+len1]=b[i];
//	}
//	
//	for(i=0; i<len3; i++)
//	{
//		printf("%d ",merge[i]);
//	}
//	return 0;	
//}


//	2.. Write a c program to find prime number in array

//#include<stdio.h>
//int main()
//{
//	int a[5],i,count,j,len;
//	len=sizeof(a)/sizeof(a[0]);
//	printf("Enter the value in array\n");
//	for(i=0; i<5; i++)
//	{
//		scanf("%d",&a[i]);
//	}
//	for(i=0; i<5; i++)
//	{
//		count=0;
//		for(j=2; j<a[i]; j++)
//		{
//			if(a[i]%j==0)
//			{
//				count++;
//			}
//		}
//		if(count==0 && a[i]!=1)
//			{
//				printf("\t%d\n",a[i]);
//			}
//	}
//	return 0;
//}



//		3... Write a c program to find perfect number in array.

//#include<stdio.h>
//int main()
//{
//	int a[5],i,sum,j,len;
//	len=sizeof(a)/sizeof(a[0]);
//	
//	printf("Enter The value in Array \n");
//	for(i=0; i<len; i++)
//	{
//		scanf("%d",&a[i]);
//	}
//	for(i=0; i<len; i++)
//	{
//		sum = 0;
//		for(j=1; j<a[i]; j++)
//		{
//			if(a[i]%j==0)
//			{
//				sum=sum+j;
//			}
//		}
//		if(sum==a[i])
//		{
//			printf("%d\n",sum);
//		}
//	}
//	return 0;
//}


//       <<<Extra>>>>... Write c program to remove element from array.

//#include<stdio.h>
//int main()
//{
//	int a[5],i,k,len,ele,flag=0;
//	len=sizeof(a)/sizeof(a[0]);
//	printf("Enter The Array Element\n");
//	for(i=0; i<len; i++)
//	{
//		scanf("%d",&a[i]);
//	}
//	printf("Before removal of array element\n");
//	for(i=0; i<5; i++)
//	{
//		printf("%d ",a[i]);
//	}
//	printf("\n Enter Number to remove from array ");
//	scanf("%d",&ele);
//				//removing element from array
//	for(i=0; i<5; i++)
//	{
//		if(a[i]==ele)
//		{
//			len--;
//			flag=1;
//			for(k=i; k<5; k++)
//			{
//				a[k]=a[k+1];
//			}
//			i=i-1;
//		}
//	}
//	if(flag==0)
//	{
//		printf("\n %d Not present in array ");
//	}
//	else
//	{
//		printf("\n After removing element"); 
//		for(i=0; i<len; i++)
//		{
//			printf("%d ",a[i]);
//		}
//	}
//	return 0;
//}


//		4...   Write c program to remove element in specific index.

//#include<stdio.h>
//int main()
//{
//	int a[10],i,n,index;
//	
//	printf("Enter the Array size\n");
//	scanf("%d",&n);
//	
//	printf("Enter the array element\n");
//	for(i=0; i<n; i++)
//	{
//		scanf("%d",&a[i]);
//	}
//	                       
//	printf("Remove element in specific Index\n");
//	scanf("%d",&index);
//	
//	for(i=index; i<n; i++)
//	{
//		a[i]=a[i+1];
//	}
//	n--;
//	for(i=0; i<n; i++)
//	{
//		printf("%d\t",a[i]);
//	}
//	return 0;
//}


//      5... Write a c program to add element in Specific index of array.

//#include<stdio.h>
//int main()
//{
//	int a[10],i,ele,n,index;
//	printf("Enter The Size of Array\n");
//	scanf("%d",&n);
//	
//	printf("Enter the element of array\n");
//	for(i=0; i<n; i++)
//	{
//		scanf("%d",&a[i]);
//	}
//	printf("\n Befor Adding\n");
//	for(i=0; i<n; i++)
//	{
//		printf("%d ",a[i]);
//	}
//	printf("Enter the Index for add element\n");
//	scanf("%d",&index);
//	
//	printf("Enter the For add element\n");
//	scanf("%d",&ele);
//	for(i=n; i>index; i--)
//	{
//		a[i+1]=a[i];
//	}
//	a[index]=ele;
//	printf("/n After Adding");
//	for(i=0; i<n	; i++)
//	{
//		printf("%d ",a[i]);
//	}
//	return 0;
//}



		//  6.. Write C program to find occurence in each element in Array.
//#include<stdio.h>
//int main()
//{
//	int i,j,size,temp;
//	printf("Enter The size \n");
//	scanf("%d",&size);
//	int a[size];
//	printf("Enter the array element\n");
//	for(i=0; i<size; i++)
//	{
//		scanf("%d",&a[i]);
//	}
//	
//	for(i=0; i<size; i++)
//	{
//		for(j=i+1; j<size; j++)
//		{
//			if(a[i]<a[j])
//			{
//					temp = a[i];
//					a[i]=a[j];
//					a[j]=temp;	
//			}
//		}
//	
//	}
//	
//	for(i=0; i<size; i++)
//	{
//		printf("\n %d",a[i]);
//	}
//	
//	int count=1;
//	for(i=0; i<size; i++)
//	{
//		if(a[i]==a[i+1])
//		{
//			count++;
//		}
//		else
//		{
//			printf("\n%d Occure %d times\n",a[i],count);
//			count=1;
//		}
//	}
//	return 0;
//}  


