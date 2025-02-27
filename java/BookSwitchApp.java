/*Q1.	Create class name as Book with using data member bid,bname,bprice,fauthor,bpublication using do while and 
		switch case and using set and get.
		
		create array of object of size 10 ,store the Book details in it and perform following operations.
	
	case 1 : Add All Book details.
	case 2 : Display All Book details.
	case 3 : Display Book details whose price range between 100 to 500.
	case 4 : Search Book  details using by:
					case 1 : Book Id
					case 2 : Book name
					case 3 : Book price
					case 4 : Book author.
	case 5 : Update Book details using by:
					case 1 :  Book Id
					case 2 : Book name
					case 3 : Book price
					case 4 : Book publication.	
	case 6 : Delete Book details using by:
					case 1 : Book Id
					case 2 : Book name
					case 3 : Book price
					case 4 : Book publication.
					case 5 : Book author.
	case 7 : Count Book details using by:
					case 1 : Book name
					case 2 : Book price
					case 3 : Book publication.
					case 4 : Book author.
	case 8 : Sort Book Details :
					case 1 : Ascending Order By Id.
					case 2 : Descending Order By Price.
	case 9 : Display Second Highest Book Price Details.
	case 10 : Exit the code.*/
	
	import java.util.*;
	class Book
	{
		private int bid;
		private String bname;
		private int bprice;
		private String bauthor;
		private String bpublication;
		
		public void setId(int bid)
		{
			this.bid=bid;
		}
		public int getId()
		{
			return bid;
		}
		
		public void setName(String bname)
		{
			this.bname=bname;
		}
		public String getName()
		{
			return bname;
		}
		
		public void setPrice(int bprice)
		{
			this.bprice=bprice;
		}
		public int getPrice()
		{
			return bprice;
		}
		
		public void setAuthor(String bauthor)
		{
			this.bauthor=bauthor;
		}
		public String getAuthor()
		{
			return bauthor;
		}
		
		public void setPublication(String bpublication)
		{
			this.bpublication=bpublication;
		}
		public String getPublication()
		{
			return bpublication;
		}
		
	}
	public class BookSwitchApp
	{
		public static void main(String args [])
		{
			Scanner sc = new Scanner (System.in);
			Book b[] = new Book[2];		// Array Of Reference.
			System.out.println("case 1 : Add All Book details.");
			System.out.println("case 2 : Display All Book details.");
			System.out.println("Enter Your Choice ");
			int ch = sc.nextInt();
			do{
				switch(ch)
				{
					case 1:
						for(int i=0; i<b.length; i++)
						{
							b[i] = new Book();		// Array Of Object.
							System.out.println("Enter The Book Name :");
							String name = sc.nextLine();
							System.out.println("Enter The Book Id :");
							int id = sc.nextInt();
							sc.nextLine();
							System.out.println("Enter The Book Author :");
							String aut = sc.nextLine();
							System.out.println("Enter The Book Price :");
							int p = sc.nextInt();
							sc.nextLine();
							System.out.println("Enter The Book Publication :");
							String publ = sc.nextLine();
							b[i].setName(name);
							b[i].setId(id);
							b[i].setAuthor(aut);
							b[i].setPrice(p);
							b[i].setPublication(publ);
						}
					break;
					
					case 2:
						System.out.println("Display Book Details :");
						for(int i=0; i<b.length; i++)
						{
							System.out.println(b[i].getId()+"\t"+b[i].getName()+"\t"+b[i].getAuthor()+"\t"+b[i].getPrice()+"\t"+b[i].getPublication());
						}
					break;
					default:
						System.out.println("Invalid Input...");
				}
				
			}while(true);
			
			
			/*System.out.println("Display Book Details :");
			for(int i=0; i<b.length; i++)
			{
				System.out.println(b[i].getId()+"\t"+b[i].getName()+"\t"+b[i].getAuthor()+"\t"+b[i].getPrice()+"\t"+b[i].getPublication());
			}*/
		}
	}