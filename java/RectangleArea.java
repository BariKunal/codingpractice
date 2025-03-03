/*2.Create the Class Name as Rectangle with a following methods and write its logics. 
class Rectangle 
{ void setLengthWidth(int len,int wid)//accept the length and width  
{ 
} 
void showArea() 
{ //write here calculation logics of circle area and display it 
} 
} 
public class AreaApp 
{  public static void main(String x[]) 
{  //create here object of scanner and accept the length and width as input  
//create the object of Rectangle and call setLengthWidth and pass radius input as parameter 
//call showArea() for display the display the area 
} 
}*/

import java.util.*;
class Rectangle
{
	int len,wid;
	void setLengthWidth(int len,int wid)
	{
		this.len = len;
		this.wid = wid;
	}
	void showArea()
	{
		int area = len * wid;
		System.out.println("Area Of Rectangle is: "+area);
	}
}
public class RectangleArea
{
	public static void main(String kunal[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Length of Rectangle");
		int length = sc.nextInt();
		System.out.println("Enter The Width of Rectangle");
		int width = sc.nextInt();
		
		Rectangle r = new Rectangle();
		r.setLengthWidth(length,width);
		r.showArea();
	}
}