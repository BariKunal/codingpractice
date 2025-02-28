/*6. create the class name as ConvertToUpper with a following methods 
class ConvertToUpper 
{  char c[]; 
void setCharArray(char ch[]) 
{ //here accept the character array and store in instance variable in character array 
c=ch; 
} 
void convertToUpperCase() 
{ //here we need to write the manual logics for converting lower case array 
//to upper case 
} 
} 
public class ConvertToUpperApp 
{ 
public static void main(String x[]) 
{   
//here declare the fix array with a some character e.g char ch[]=new char[]={"good"}; 
//here create the object of ConvertToUpper class  
//call setCharArray() function and pass ch array in setCharArray() function 
//call convertToUpperCase() function and see the result 
} 
}*/

import java.util.*;
class ConvertToUpper
{
	char ch[];
	void setCharArray(char ch[]) 
	{
		this.ch=ch;
	}
	void convertToUpperCase() 
	{
		for(int i=0; i<ch.length; i++)
		{
			if((ch[i]>=90) && (ch[i]<=122))
			{
				ch[i] = (char) ((int) ch[i]-32);
			}
			System.out.print(" "+ch[i]);
		}
	}
}
public class ConvertToUpperApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		char ch[] = new char[5];
		ConvertToUpper ct = new ConvertToUpper();
		System.out.println("Enter the Characters in Array :");
		for(int i=0; i<ch.length; i++)
		{
			ch[i] = sc.next().charAt(0);
		}
		ct.setCharArray(ch);
		ct.convertToUpperCase();
	}
	
}