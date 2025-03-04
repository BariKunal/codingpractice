/*4. WAP to create the class name as Student with a following methods  
class Student 
{ void setSubMarks(int s[]) 
   { //here we need to store the array in instance variable  
   } 
   void calculatePer() 
   { //here we need to call the aggregate of six subjects marks through the array and calculate its per 
		and store in instance variable. 
   }  
   void checkGrades() 
   { //here we need to check grades means per>75 && per<=100 then student in distinction  if per>60 
		&& per<=75 then in first division  if per>=50 && per<=60 then second division and if per>40 && 
		per<=50 then in third division and if per <40 then  student failed  
   } 
} 
public class StudentApp 
{   public static void main(String x[]) 
    {   //create the object of scanner class 
		//declare the array with 6 six of type integer and store input values in array as subject marks 
		//create the object of Student class and call the setSubMarks() function and pass array in it 
		//then call calculatePer() student function 
		//then call checkGrades() function for checking the grading of students. 
} 
}*/

import java.util.*;
class Student
{
	int marks[];
	double per;
	void setSubMarks(int s[])
	{
		marks = s;
	}
	void calculatePer() 
	{
		int total=0;
		for(int i=0; i<marks.length; i++)
		{
			total = total + marks[i];
		}
		per = total/marks.length;
		System.out.println("Total Percentage Of Six Subjects :"+per);
	}
	void checkGrades() 
	{
		System.out.println();
		if(per>75 && per<=100)
		{
			System.out.println("Distinction");
		}
		else if(per>60 && per<=75)
		{
			System.out.println("First Division");
		}
		else if(per>=50 && per<=60)
		{
			System.out.println("Second Division");
		}
		else if(per>=40 && per<=50)
		{
			System.out.println("Third Division");
		}
		else if(per<40)
		{
			System.out.println("Failed...");
		}
		else
		{
			System.out.println("Invalid Percentage...");
		}
	}
}
public class StudentMarksApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int s[] = new int [6];
		System.out.println("Enter The 6 Subjects Marks :");
		for(int i=0; i<s.length; i++)
		{
			System.out.println("Enter the "+(i+1)+"  Subject Marks");
			s[i] = sc.nextInt();
		}
		Student st = new Student();
		st.setSubMarks(s);
		st.calculatePer();
		st.checkGrades();
	}
}
