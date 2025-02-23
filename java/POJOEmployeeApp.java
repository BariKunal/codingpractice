/*Q1. WAP to create class name as Employee with field id,name and salary and create array of object of size 5 
and perform following operation on it.
Case 1: Add New Employee details 
Case 2: View all employee details
Case 3: Sort All employee records by using its id.
Case 4: Search employee by using name means you have to input the name of employee and search employee present in array or not */

import java.util.*;
class Employee
{
	//pojo class here setter and getter.
	private int id; private String name; private double salary;
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public double getSalary()
	{
		return salary;
	}
}
public class POJOEmployeeApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Of Employees You Want to insert :");
		int size = sc.nextInt();
		
		Employee emp[] = new Employee[size];
		
		
		for(int i=0; i<emp.length; i++)
		{
			emp[i] = new Employee();  //object.
		}
		char choice;
		do{
			System.out.println("\n1: Add New Employee details ");
			System.out.println("2: View all employee details ");
			System.out.println("3: Sort All employee records by using its id. ");
			System.out.println("4: Search employee by using name ");
			
			System.out.println("Enter Your Choice :");
			int ch = sc.nextInt();
			sc.nextLine();
		switch(ch)
		{
			case 1:
				System.out.println("Enter The Employee Information :");
				for(int i=0; i<emp.length; i++)
				{
					System.out.println("\nEnter The ID of Employee :");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter The Name of Employee :");
					String name = sc.nextLine();
					System.out.println("Enter The Salary of Employee :");
					double sal = sc.nextDouble();	
				
					
					emp[i].setId(id);
					emp[i].setName(name);
					emp[i].setSalary(sal);
 				}
				break;
			case 2:
				System.out.println("_________Employee Details_________");
				for(int i=0; i<size; i++)
				{
					System.out.println(" Employee id :"+emp[i].getId()+"\n Employee Name :"+emp[i].getName()+"\n Employee Salary :"+emp[i].getSalary());
					System.out.println();
				}
				break;
			case 3:
				System.out.println("Sorted Employee By There ID :");
				for(int i=0; i<size; i++)
				{
					for(int j=0; j<size; j++)
					{
						if(emp[i].getId() < emp[j].getId())
						{
							Employee temp = emp[i];
								emp[i]= emp[j];
								emp[j]= temp; 
						}
					}
				}
				for(int i=0; i<size; i++)
				{
					System.out.println(" Employee id :"+emp[i].getId()+"\n Employee Name :"+emp[i].getName()+"\n Employee Salary :"+emp[i].getSalary());
				}
				break;
			case 4:
				boolean found=false;
				System.out.println("Searching employee by using name :");
				System.out.println("Enter The Name of Employee :");
				String n = sc.nextLine();
				for(int i=0; i<size; i++)
				{
					
					if(emp[i].getName().equals(n))
					{
						System.out.println(" Employee id :"+emp[i].getId()+"\n Employee Name :"+emp[i].getName()+"\n Employee Salary :"+emp[i].getSalary());
						found = true;
					}					
				}
				if(!found)
				{
					System.out.println(" Is Not Employee... ");
				}
				break;
			default:
				System.out.println("Invalid Choice...");
		}
		System.out.println("Do you want to repeat :");
		choice = sc.next().charAt(0);
		}while(choice=='y' || choice=='Y');
	}
}