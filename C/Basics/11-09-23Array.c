//     1...   ISRO Chandrayan III

//#include<stdio.h>
//int main()
//{
//	int a[12],i,j,len,mid,end;
//	len=sizeof(a)/sizeof(a[0]);
//	mid=(len/2);
//	end=(len-1);
//	printf("Enter the Messege Signals\n");
//	for(i=0; i<12; i++)
//	{
//		scanf("%d",&a[i]);
//	}
//	printf("Array Messege\n");
//	for(i=0; i<len; i++)
//	{
//		printf("%d\t",a[i]);
//	}
//	
//	for(i=0; i<mid; i++)
//	{
//		int temp;
//		temp=a[i];
//		a[i]=a[end];
//		a[end]=temp;
//		--end;
//	}
//	printf("Reverse Array Msg\n");
//	for(i=0; i<len; i++)
//	{
//		printf("%c\n",a[i]-4);
//	}
//	return 0;
//}



//#include<stdio.h>
//int main()
//{
//	int a[40],i,len,mid,end,temp;
//	len=sizeof(a)/sizeof(a[0]);
//	mid=(len/2);
//	end=(len-1);
//	printf("Enter The Array Message Elements\n");
//	for(i=0; i<40; i++)
//	{
//		scanf("%d",&a[i]);
//	}
//	printf("Array Message\n");
//	for(i=0; i<len; i++)
//	{
//		printf("%d",a[i]);
//	}
//	printf("Reverse Array\n");
//	for(i=0; i<mid; i++)
//	{
//		temp=a[i];
//		a[i]=a[end];
//		a[end]=temp;
//		--end;
//	}
//	printf("Reverse Array Msg\n");
//	for(i=0; i<len; i++)
//	{
//		printf("%c\n",a[i]-5);
//	}
//	return 0;
//}


//#include<stdio.h>
//int main()
//{
//	int a[6],i,j,len,mid,end,temp;				//incomplete
//	len=sizeof(a)/sizeof(a[0]);
//	mid=(len/2);
//	end=(len-1);
//	printf("Enter The Array Elements\n");
//	for(i=0; i<len; i++)
//	{
//		scanf("%d",&a[i]);
//	}
//	printf("Array Elements\n");
//	for(i=0; i<len; i++)
//	{
//		printf("%d\n",a[i]);
//	}
//	printf("Missing Element of Array\n");
//	for(i=0; i<len-1; i++)
//	{
//		for(j=a[i]+1; j<a[i+1]; )
//		{
//			printf("%d\n",++j);
//		}	
//	}
//	return 0;
//}


#include<stdio.h>
int main()
{
	int a[5],i,j,len,gr;
	len=sizeof(a)/sizeof(a[0]);
	printf("Eneter The Array Elements\n");
	for(i=0; i<len; i++)
	{
		scanf("%d",&a[i]);
	}
	printf("Array Elements\n");
	for(i=0; i<len; i++)
	{
		printf("%d ",a[i]);
	}
	
	for(i=0; i<len; i++)
	{
		
	}
	}
	
	return 0;
}
