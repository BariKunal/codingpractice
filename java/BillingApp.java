//	Q2. WAP to develop the billing application using the following classes.
//	       a)Product class with field id,name,qty,rate and mark as product as POJO class
//	       b)Customer class with field id,name,address,contact and mark customer as POJO class
//	       c)Bill class with following methods 
//	            Void setOrder(Customer c,Product …p) : this method can accept customer details and customer product list and calculate its bill and show output using 		    
//		    following fashion


class Product
{
    private int id;
    private String name;
    private int qty;
    private int rate;

    public void setid(int i)
    {
	id = i;
    }
    public int getid()
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
    public void setQuantity(int qt)
    {
	qty = qt;
    }
    public int getQuantity()
    {
	return qty;
    }
    public void setRate(int r)
    {
	rate = r;
    }
    public int getRate()
    {
	return rate;
    }


}
class Customer
{
    private int id;
    private String name;
    private String add;
    private int cont;

    public void setCustId(int i1)
    {
	id = i1;
    }
    public int getCustId()
    {
	return id;
    }
    public void setCustName(String n)
    {
	name = n;
    }
    public String getCustName()
    {
	return name;
    }
    public void setCustAdd(String ad)
    {
	add = ad;
    }
    public String getCustAdd()
    {
	return add;
    }
    public void setCustCont(int co)
    {
	cont = co;
    }
    public int getCustCont()
    {
	return cont;
    }
}
class Bill
{
    Product product[];

    void setOrder(Customer customer,Product ...p)
    {
	product=p;
	

	System.out.println("--------- Customer Details -----------");
        System.out.println("ID: " + customer.getCustId());
        System.out.println("Name: " + customer.getCustName());
        System.out.println("Address: " + customer.getCustAdd());
        System.out.println("Contact: " + customer.getCustCont());
        System.out.println("--------------------------------------");	

	//System.out.println("Customer Details...");
	//System.out.println(p.getCustId()+"\t"+p.getCustName()+"\t"+Customer.getCustAdd()+"\t"+Customer.getCustCont());
	
	System.out.println("Customer Products...");
	System.out.println("ID\tName\tQty\tRate\tTotal\n");
	int allTotal=0;
	for(int i=0; i<product.length; i++)
	{
	    int total = product[i].getQuantity() * product[i].getRate();
	    allTotal = allTotal+total;
	    System.out.println(product[i].getid()+"\t"+product[i].getName()+"\t"+product[i].getQuantity()+"\t"+product[i].getRate()+"\t"+total);	
	}
	System.out.println("--------------------------------------");
        System.out.println("Total Bill Without GST: \t" + allTotal);
	double gst = allTotal * 0.18;
	double gsttotal = allTotal+gst;
	System.out.println("Total Bill With (18%) GST: \t" + gsttotal);
	
    }
}
public class BillingApp
{
    public static void main(String x[])
    {
	Bill b = new Bill();

	Customer customer = new Customer();
	customer.setCustId(1);
        customer.setCustName("ABC");
	customer.setCustAdd("PUNE");
	customer.setCustCont(123456789);
	
	Product p1 = new Product();
	p1.setid(1);
	p1.setName("ABC");
	p1.setQuantity(10);
	p1.setRate(10);
	
	Product p2 = new Product();
	p2.setid(2);
	p2.setName("PQR");
	p2.setQuantity(10);
	p2.setRate(100);

	Product p3 = new Product();
	p3.setid(3);
	p3.setName("XYZ");
	p3.setQuantity(20);
	p3.setRate(100);
	
	b.setOrder(customer,p1,p2,p3);
	
	
    }
}