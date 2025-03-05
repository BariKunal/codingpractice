import java.util.*;
class Product
{
	private int productId;
	private String proName;
	private int price;
	private int quantity;
	private String Categ;
	
	Product(int productId,String proName,int price,int quantity,String Categ)
	{
		this.productId=productId;
		this.proName=proName;
		this.price=price;
		this.quantity=quantity;
		this.Categ=Categ;
	}
	
	public void setId(int productId)
	{
		this.productId=productId;
	}
	public int getId()
	{
		return productId;
	}
	public void setName(String proName)
	{
		this.proName=proName;
	}
	public String getName()
	{
		return proName;
	}	
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getPrice()
	{
		return price;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setCateg(String Categ)
	{
		this.Categ = Categ;
	}
	public String getCateg()
	{
		return Categ;
	}
}

class Stock
{
	Scanner sc = new Scanner(System.in);
	Product p[];
	int size;
	Stock(Product...p)
	{
		this.p=p;
		size = p.length;
	}
	void displayArray()
	{
		System.out.println("ID\tName\tPrice\tQuantity\tCategory");
		for(int i=0; i<size; i++)
		{
			System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getPrice()+"\t"+p[i].getQuantity()+"\t\t"+p[i].getCateg());
		}
	}
	
	void updateData()
	{
		System.out.println("Enter The ID for Updatation :");
		int upid = sc.nextInt();
		for(int i=0; i<size; i++)
		{
			if(p[i].getId()==upid)
			{
				System.out.println("Enter The New Quantity :");
				p[i].setQuantity(sc.nextInt());
			}
		}
	}
	
	void DeleteData()
	{
		System.out.println("Enter The ID for Deletion :");
		int updid = sc.nextInt();
		
		for(int i=0; i<size; i++)
		{
			if(p[i].getId()==updid)
			{
				for(int j=i; j<size-1; j++)
				{
					p[i] = p[j+1];
				}
				size--;
				break;
			}
			
		}
	}
	
	void Highestproductstock()
	{			
		int max=0;
		for(int i=0; i<size; i++)
		{
			if(p[i].getQuantity()>=p[max].getQuantity())
			{
				max=i;
			}
					//p[max].getQuantity();
		}
		System.out.println("Product with the highest stock:");
		System.out.println("ID: " + p[max].getId() + ", Name: " + p[max].getName() +
			", Price: " + p[max].getPrice() + ", Quantity: " + p[max].getQuantity() +", Category: " + p[max].getCateg());
				
	}
}
public class ProductInfo
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Products Details :");
		Product p[] = new Product[3];
		
		for (int i = 0; i < p.length; i++) {
            System.out.print("Enter The Product Id: ");
            int id = sc.nextInt();
            sc.nextLine(); //  newline

            System.out.print("Enter The Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter The Product Price: ");
            int price = sc.nextInt();

            System.out.print("Enter The Product Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine(); //  newline

            System.out.print("Enter The Product Category: ");
            String category = sc.nextLine();

            p[i] = new Product(id, name, price, quantity, category);
            System.out.println("-------------------------");
        }
		Stock s = new Stock(p);
		s.displayArray();
        s.updateData();
        s.displayArray(); // Display updated data
        s.DeleteData();
        s.displayArray(); // Display after deletion
        s.Highestproductstock();
	}
}