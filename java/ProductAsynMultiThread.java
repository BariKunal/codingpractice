/*	Question 1: perform task using asynchronization technique */
import java.util.*;

class Product
{
	private int id;
	private String name;
	
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
}

class MachineOne extends Thread
{
	Product p[];
	public void setProduct(Product ...p)
	{
		this.p=p;
	}
	
	public void run()
	{
		try
		{
			for(int i=0; i<p.length; i++)
			{
				System.out.println("Machine One Data :\n"+p[i].getId()+" "+p[i].getName());
				Thread.sleep(5000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is :"+ex);
		}
	}
}

class MachineTwo extends Thread
{
	Product p[];
	public void setProduct(Product ...p)
	{
		this.p=p;
	}
	
	public void run()
	{
		try
		{
			for(int i=0; i<p.length; i++)
			{
				System.out.println("Machine Two Data :\n"+p[i].getId()+" "+p[i].getName());
				Thread.sleep(5000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is :"+ex);
		}
	}
}

public class ProductAsynMultiThread
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The 2 products :");
		
		Product p[] = new Product[2];
		
		
		for(int i=0; i<p.length; i++)
		{
			System.out.print("Enter The Id of Product :");
			int pid = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter The Name of Product :");
			String pname = sc.nextLine();
			
			p[i] = new Product();
			
			p[i].setId(pid);
			p[i].setName(pname);
		}
		MachineOne m1 = new MachineOne();		//object creation of MachineOne
		m1.setProduct(p);						// calling
		m1.start();								// start the threading process.
		
		MachineTwo m2 = new MachineTwo();
		m2.setProduct(p);
		m2.start();
	}
}