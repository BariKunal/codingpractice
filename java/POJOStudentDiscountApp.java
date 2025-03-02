/*10) WAP to create the pojo class name as Student class with a following methods and data 
or variable/state 
class Student 
{   
int id;String name;float per; 
int totalFees;int disFees; 
int actualPaidFees; 
void setId(int id) 
{ this.id=id; 
} 
int getId() 
{ return id; 
} 
void setName(String name) 
{ this.name=name; 
} 
String getName() 
{ return name; 
} 
//do setter and getter for all students 
} 
Create the class name as DiscountFees and this class is depend on Student class means in this class 
we need to write a method setStudent() and accept the reference of Student class in it  
As well as we need to define two another method in this class name as  checkDiscountEligibility(int 
per) -> this function accept the per of student if per greater than 60 then student is eligible for 
discout and give the 30% discount on fees and update in student object  
And we need to write one more function in DiscountFees class show() and in this function contain 
the logics for display the all details of Students with discounted fees 
Following sample code gives the completed structure about the two class with empty methods. 
Also create the main method class with a following operation given below. 
public class StudentDiscountApp 
{ 
public static void main(String x[ ]) 
{  //create the object of Scanner class 
//declare the variables for id,name ,per,totalFees,per and accept the input and store its value in 
variable usign scanner 
//create the object of student class and store the values in object using setter methods 
//create the object of DiscountFees class and call setStudent() method and pass student class 
reference in it 
//call the checkDiscountEligilibility() method and pass per in it accepted from keyboard 
//call show() method here 
} 
}*/

import java.util.*;
class Student
{
	int id;
	String name;
	float per; 
	int totalFees;
	int disFees; 
	int actualPaidFees; 
	void setId(int id) 
	{
		this.id=id; 
	} 
	int getId() 
	{
		return id; 
	} 
	void setName(String name) 
	{
		this.name=name; 
	} 
	String getName() 
	{
		return name; 
	} 
	void setPer(float per)
	{
		this.per=per;
	}
	float getPer()
	{
		return per;
	}
	void setTotalFees(int totalFees)
	{
		this.totalFees=totalFees;
	}
	int getTotalFees()
	{
		return totalFees=totalFees;
	}
	void setDisFees(int disFees)
	{
		this.disFees=disFees;
	}
	int getDisFees()
	{
		return disFees;
	}
	void setActualPaidFees(int actualPaidFees)
	{
		this.actualPaidFees=actualPaidFees;
	}
	int getActualPaidFees()
	{
		return actualPaidFees;
	}
}
class DiscountFees
{
	Student student;
	void setStudent(Student student)
	{
		this.student = student;
	}
	void setCheckDiscountEligibility(float per)
	{
		int disfee = 0;
		System.out.println("--------------------------------------------");
		if(per>=60 && per<=100)
		{
			disfee = (student.getTotalFees()*30)/100;
			System.out.println("Student Is Eligible for 30% of Discount in fees :"+disfee);
			//System.out.println("Discount "+disfee);
			student.setDisFees(disfee);
			System.out.println(student.getDisFees());
			
			int total=student.getTotalFees()-disfee;
			student.setActualPaidFees(total);
		}
		else
		{
			System.out.println("Student is Not Eligible for 30% Discount.....");
		}
	}
	void show()
	{
		System.out.println("Id\tName\tPercentage\tTotal Fees\tDiscount Fees\tActual Fees");
		System.out.println(student.getId()+"\t"+student.getName()+"\t"+student.getPer()+"\t\t"+student.getTotalFees()+"\t\t"+student.getDisFees()+"\t\t"+student.getActualPaidFees());
	}
	void DiscountFeesShow(float per)
	{
		int rem=0;
		if(per>=60 && per<=100)
		{
			rem = student.getTotalFees()-student.getActualPaidFees();
			System.out.println("Total Fees\tDiscount Fees\tActual Fees\tRemaining fees");
			System.out.println(student.getTotalFees()+"\t\t"+student.getDisFees()+"\t\t"+student.getActualPaidFees()+"\t\t"+rem);
		}
	}
	
}
public class POJOStudentDiscountApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter The Count of Students you want to accept :");
		int n = sc.nextInt();
		int s[] = new int[n];
		System.out.println("Enter The Array Elements :");
		for(int i=0; i<s.length; i++)
		{		
		}*/
		System.out.println("Enter The id of Student :");
		int stdid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter The Name of Student :");
		String stdname = sc.nextLine();
		System.out.println("Enter The Percentage of Student :");
		float stdper = sc.nextFloat();
		System.out.println("Enter The Total Fees of Student :");
		int stdtotalFees = sc.nextInt();
		System.out.println("Enter The Discount Fees of Student :");
		int stddisFees = sc.nextInt();
		System.out.println("Enter The Actual Fees Paid of Student :");
		int stdactualPaidFees = sc.nextInt();
		
		Student st = new Student();
		st.setId(stdid);
		st.setName(stdname);
		st.setPer(stdper);
		st.setTotalFees(stdtotalFees);
		st.setDisFees(stddisFees);
		st.setActualPaidFees(stdactualPaidFees);
		
		DiscountFees dis = new DiscountFees();
		dis.setStudent(st);
		dis.show();
		dis.setCheckDiscountEligibility(stdper);
		dis.DiscountFeesShow(stdper);
		
	}
}