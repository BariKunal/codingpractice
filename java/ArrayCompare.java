/* Q2. WAP to Compare with two array
Compare(int a[],int b[]): this constructor can accept two array as parameter of type integer 
Compare(char[],char[]): this constructor can accept two character array 
Boolean  isIntegerArrayEqual(): this function can compare two integer array and if both array data is equal return true otherwise return false if function return true then show the message integer array are equal otherwise not equal
Boolean isCharArrayEqual(): this function can compare two character array and if both array data is same return true otherwise return false if function return true then show message character array equal otherwise not */

import java.util.*;

class Compare{
	char c1[],c2[];
	int a[], b[];
	Boolean flag=true;
	Compare(int a[], int b[]){
		this.a=a;
		this.b=b;
	}
	Compare(char c1[], char c2[]){
		this.c1=c1;
		this.c2=c2;
	}

	
	Boolean isIntegerArrayEqual(){
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}	

		for(int i=0;i<b.length;i++){
			for(int j=i+1;j<b.length;j++){
				if(b[i]>b[j]){
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}			
					
		for(int i=0;i<a.length;i++){
			if(a[i]!=b[i])
				return false;
		}
		return true;
	}
	
	
	
	Boolean isCharArrayEqual(){
		for(int i=0;i<c1.length;i++){
			for(int j=i+1;j<c1.length;j++){
				if(c1[i]>c1[j]){
					char temp=c1[i];
					c1[i]=c1[j];
					c1[j]=temp;
				}
			}
		}	

		for(int i=0;i<c2.length;i++){
			for(int j=i+1;j<c2.length;j++){
				if(c2[i]>c2[j]){
					char temp=c2[i];
					c2[i]=c2[j];
					c2[j]=temp;
				}
			}
		}			
					
		for(int i=0;i<c1.length;i++){
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
	}
	
}

class ArrayCompare{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		int b[]=new int[3];
		char c1[]=new char[3];
		char c2[]=new char[3];
		
		System.out.print("Enter integer values of array A: ");
		for(int i=0; i<a.length;i++)
		{
		   a[i]=sc.nextInt();
		}
		System.out.print("Enter integer values of array B: ");
		for(int i=0; i<b.length;i++)
		{
		   b[i]=sc.nextInt();
		}
		Compare com1=new Compare(a,b);
		Boolean intRes=com1.isIntegerArrayEqual();
		if(intRes)
			System.out.print("Equal Interger Array");
		else
			System.out.print("Not equal Integer array");
		
		
		
		
		System.out.print("\n\nEnter character values of array c1: ");
		for(int i=0; i<c1.length;i++)
		{
		   c1[i]=sc.next().charAt(0);
		}
		System.out.print("Enter character values of array c2: ");
		for(int i=0; i<c2.length;i++)
		{
		   c2[i]=sc.next().charAt(0);
		}
		Compare com2=new Compare(c1,c2);
		Boolean intRes2=com2.isCharArrayEqual();
		if(intRes2)
			System.out.print("Equal Character Array");
		else
			System.out.print("Not equal character array");
		
			
	}
}