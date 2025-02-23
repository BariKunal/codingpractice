/*Q2. WAP to create class name as Product as POJO class with field id,name and qty and price and you have to create Shop as class with following methods 
void setProducts(Customer customer,Product …p): this method can accept the n number of products 
void findBill(): this function can find the bill of a customer using the following format.*/


import java.util.*;
class Product
{
	private int id;
	private String name;
	private int qty;
	private int price;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	public int getQty()
	{
		return qty;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	
} 

class Shop
{
	private Product p[];
	private String cname;
	private int cid;
	private String add;
	public void setProducts(String cname, int cid, String add, Product ...p)
	{
		this.cname=cname;
		this.cid=cid;
		this.add=add;
		this.p=p;
	}
	public void findBill()
	{
		System.out.println("....Customer Details....");
		System.out.println("Customer Name :"+cname);
		System.out.println("Customer ID :"+cid);
		System.out.println("Customer Address :"+add);
		int total=0;
		System.out.println("ID\t Name \tQuantity\t Price\t Amount");
		for(int i=0; i<p.length; i++)
		{
			int result = p[i].getQty() * p[i].getPrice();
			total+=result;
			System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getQty()+"\t"+p[i].getPrice()+"\t"+result);
			
		}
		System.out.println("Total Bill :"+total);
	}
}

public class ShopProductPOJOApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number of Products ");
		int size = sc.nextInt();
		
		Product p[] = new Product[size];
		
		System.out.println("Enter The Customer Details :");
		System.out.print("Enter The Custome Name :");
		sc.nextLine();
		String cname = sc.nextLine();
		System.out.print("Enter The Custome ID :");
		int cid = sc.nextInt();
		System.out.print("Enter The Custome Address :");
		sc.nextLine();
		String cadd = sc.nextLine();
		
		for(int i=0; i<size; i++)
		{
			System.out.print("Enter the Product ID :");
			int pid = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the Product Name :");
			String pname = sc.nextLine();
			System.out.print("Enter the Product Quantity :");
			int pqty= sc.nextInt();
			System.out.print("Enter the Product Price :");
			int pprice = sc.nextInt();
			sc.nextLine();
			
			p[i] = new Product(); 	//object of POJO class...
			
			p[i].setId(pid);
			p[i].setName(pname);
			p[i].setQty(pqty);
			p[i].setPrice(pprice);
		}
		
	
		Shop sp = new Shop();     // object of shop class
		sp.setProducts(cname,cid,cadd,p);   //call the shop methods.
		sp.findBill();
		
		
	}
}