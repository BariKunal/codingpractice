/*9.WAP to create the class name as Seller with a following functions 
class Seller 
{ 
} 
void acceptSellingCostPrice(int sp,int cp) 
{ //here we need to store the sp and sp values in instance variable 
} 
void showProfitLoss() 
{ //here we need to write the logics for profit and loss 
} 
class SellerApp{ 
public static void main(String x[]) 
{ 	//here we need to create the object of Scanner class  
	//declare the two values sp and cp and store values in it using scanner 
	//create the object of Seller class 
	//call its acceptSellingCostPrice function and pass two values in it 
	//call the showProfitLoss() function 
} 
}*/


import java.util.*;
class Seller
{
	int sp,cp;
	void acceptSellingCostPrice(int sp,int cp) 
	{
		this.sp=sp;
		this.cp=cp;
	}
	void showProfitLoss() 
	{
		int pr=0,loss=0;
		pr = sp-cp;
		loss = cp-sp;
		if(sp>cp)
		{
			System.out.println("Profit..."+pr);
		}
		else
		{
			System.out.println("Loss..."+loss);
		}
	}
}
public class SellerProLossApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Seller sl = new Seller();
		int cp,sp;
		System.out.println("Enter The Cost Price :");
		cp = sc.nextInt();
		System.out.println("Enter The Selling Price :");
		sp = sc.nextInt();
		
		sl.acceptSellingCostPrice(sp,cp);
		sl.showProfitLoss();
	}
}
