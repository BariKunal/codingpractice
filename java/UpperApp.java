/*	Q1. WAP to create class name as Upper with constructor 
Upper(char[]): this constructor can accept character array as input 
char [] getUpperCase(): this function can convert lower cas string to upper case and return it  */

import java.util.*;

class Upper{
	char ch[];
	
	Upper(char ch[]){
		this.ch=ch;
	}	
	
	char[] getUpperCase(){
		for(int i=0;i<ch.length;i++){
			if(ch[i]>=97 && ch[i]<=122)
				ch[i]=(char)((int)ch[i]-32);
		}
		return ch;
	}
}

class UpperApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		char ch[]=new char[5];
		System.out.print("Enter character values: ");
		for(int i=0; i<ch.length;i++)
		{
		   ch[i]=sc.nextLine().charAt(0);
		}
		Upper u=new Upper(ch);
		
		char res[]=u.getUpperCase();
		
		System.out.println("\nDisplay character array after upper conversion");
		for(int i=0; i<res.length; i++)
		{
		   System.out.print("\t"+res[i]);
		}
	}
}