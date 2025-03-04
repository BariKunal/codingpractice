// Example1:  WAP to create class name as Student with field id, name and sub [] So you have create 5 objects of student class and store data in it and 
//	      calculate the percentage of every student and display and student should give 6 subjects exam 


import java.util.*;
class Student
{
    private int id;
    private Sting name;
    private int sub;
    
    public void setId(int i)

    {	id = i;
    }
    public int getId()
    {
	return id;
    }
    public void setName(String n)
    {
	name = n;
    }
    public String getName()
    {
	return name;
    }
    public void setSub(int subj)
    {
	sub = subj;
    }
    public int getSub()
    {
	return sub;
    }
}
public class StudentsApp
{
    public static void main(String x[])
    {
	
	Student s[] = new Student[5];
	int i;

	for(i=0; i<s.length; i++)
	{
	     s[i] = new Student();
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter The Student Id , Name & Subjects :");

	     s[i].setId=sc.nextInt();    
	     s[i].setName=sc.nextLine(); 
	     s[i].setSub=sc.nextInt();   

	     s[i].getId(id);
	     s[i].getName(name);
	     s[i].getSub(sub);
	     //sc.nextLine();
	}
	System.out.println("Students Information ");
	for(i=0; i<s.length; i++)
	{
	    System.out.println(s[i].getId()+"\t"+s[i].getName()+"\t"+s[i].getSub());
	}
    }
}