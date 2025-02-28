/*3. WAP to create the class Employee with a following methods  
class Employee 
{   
void setPersonalInfo(String name,int id,int basicSal) 
    { //in this function we need to store name ,id and basicSal in instance variable 
    } 
    void setProgressPer(int progress) 
    { //if progress value is greater than 60 per then increase the basic salary of  
      //employee with 30 percentage  
    } 
    void show() 
    {//in this function we need to show the all details of employee like as  
     //name id and basic salary as well as incremental salary and total salary of employee 
    } 
} 
public class AreaApp 
{ 	
    public static void main(String x[]) 
    {  // here create the object of Scanner class and accept the name id and basic salary as well  
       //progress per value not need to calculate it by using formual directly enter e.g 70  
       //means 70% 
      //create the object of Employee class and call setPersonalInfo and pass name id and salary 
     // in it as well as setProgressPer() and pass progress value in it 
    //call the show() method of Employee class. 
    } 
}*/

import java.util.*;
class Employee 
{   
	String name;
	int id;
	int basicSal;
	
	void setPersonalInfo(String name,int id,int basicSal) 
    { 
		this.name = name;
		this.id = id;
		this.basicSal = basicSal;
    } 
	int per=0;
    void setProgressPer(int progress) 
    { 
		if(progress>=60)
		{
			per = (basicSal*30)/100;
			int percentage = per + basicSal;
			System.out.println("Employee is Eligible for Increment in Salary 30% : "+percentage	);
		}
		else
		{
			System.out.println("Employee not Eligible for Increment in Salary 30% : ");
		}
    } 
    void show() 
    { 
		System.out.println("Name Of Employee :"+name+"\n"+"Id of Employee :"+id+"\n"+"Basic Salary of Employee :"+(basicSal+per));
    } 
} 
public class EmployeeProgess
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.println("Enter The Name Of Employee :");
		String name = sc.nextLine();
		System.out.println("Enter The Id of Employee :");
		int id = sc.nextInt();
		System.out.println("Enter The Basic Salary Of Employee :");
		int basicsal = sc.nextInt();
		
		emp.setPersonalInfo(name,id,basicsal);
		
		System.out.println("Enter The Progress Value Of Employee :");
		int pro = sc.nextInt();
		emp.setProgressPer(pro);
		emp.show();
	}
}