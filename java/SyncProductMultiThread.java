/*	Question2: Perform task using synchronization */

import java.util.*;
class Product
{
	private int id;
	private String name;
	
	void setId(int id)
	{
		this.id = id;
	}
	int getId()
	{
		return id;
	}
	void setName(String name)
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}
}
class MachineOne extends Thread
{
	Product []p;
	public synchronized void setProduct(Product ...p)
	{
		this.p=p;
	}
	public void run()
	{
		try
		{
			System.out.println("Machine One...");
			for(int i=0; i<p.length; i++)
			{
				System.out.println("MachineOne :"+p[i].getId()+" "+p[i].getName());
				Thread.sleep(5000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error Is :"+e);
		}
	}
}
class MachineTwo extends Thread
{
	Product []p;
	public synchronized void setProduct(Product ...p)
	{
		this.p=p;
	}
	public void run()
	{
		try
		{
			System.out.println("Machine Two...");
			for(int i=0; i<p.length; i++)
			{
				System.out.println("MachineTwo :"+p[i].getId()+" "+p[i].getName());
				Thread.sleep(5000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error Is :"+e);
		}
	}
}

public class SyncProductMultiThread
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		Product p[] = new Product[2];
		System.out.println("Enter The Product Details :");
		
		for(int i=0; i<p.length; i++)
		{
			System.out.println("Enter The Product Id :");
			int pid = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter The Product Name :");
			String pname = sc.nextLine();
			
			p[i] = new Product();
			
			p[i].setId(pid);
			p[i].setName(pname);
		}
		
		MachineOne m1 = new MachineOne();
		m1.setProduct(p);
		m1.start();
		
		MachineTwo m2 = new MachineTwo();
		m2.setProduct(p);
		m2.start();
	}
}