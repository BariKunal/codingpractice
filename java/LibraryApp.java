/*Q1. WAP to create Library Management application by using Array of object concept 
You have to create POJO class name as Book with field id,name ,price and author 
and we have to create one more class name as Library with following methods 

void addNewBooks(Book ...b): this function can accept infinite book as parameter 
Note: create array of object of book class with size 10 and pass parameter to function 
important point: duplicate book entry not allowed 
void showBooks(): this function can show the book details

Book getBookByName(int id): this function can accept id as parameter and search book by id and return 
book details 

Book [] getBookSortedByPrice(): this function can sort the book by using price and return book array

Book deleteBookById(int id): this function can delete the book by using its and shift its index 
at left hand side and return book detail which we delete from array 

Book[] findBooksByPrice(): you have find the books whose price is same and store all books 
details in new book array and return book array whose price is same
*/

import java.util.*;
class Book{
  private int id;
  private String name;
  private int price;
  private String author;

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
 public void setPrice(int price)
  {
     this.price=price;
  }
 public int getPrice()
 {
    return price;
 }
 public void setAuthor(String author)
  {
     this.author=author;
  }
 public String getAuthor()
  {
     return author;
  }
 public void displayDetails() {
        System.out.printf("ID: %d | Name: %s | Price: %d | Author:%s \n", id, name, price,author);
    }
}
class Libary{
 Book books[];
 void addNewBooks(Book ...newBooks)
  {
     books=newBooks;
  }
void showBooks()
  {
       for(int i=0;i<books.length;i++)
         {
             books[i].displayDetails();
         }
  }
 Book getBookByName(int id)
  {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getId() == id) {
                return books[i];
            }
        }
       return null;
  }
 Book[] getBookSortedByPrice()
  {
       for(int i=0;i<books.length;i++)
          {
             for(int j=i+1;j<books.length;j++)
              {
                 if(books[i].getPrice()>books[j].getPrice())
                    {
                       Book temp=books[i];
                            books[i]=books[j];
                            books[j]=temp;
                    }
              }
          }
     return books;
  }
Book deleteBookById(int id) {
    for (int i = 0; i < books.length; i++) {
        if (books[i] != null && books[i].getId() == id) {
            Book storeBook = books[i]; 
            for (int j = i; j < books.length - 1; j++) {
                books[j] = books[j + 1];
            }
            books[books.length - 1] = null;
            return storeBook; 
        }
    }
    return null; 
}

Book[] findBooksByPrice() {
    Book[] matchingBooks = new Book[books.length]; 
    int count = 0;

    for (int i = 0; i < books.length; i++) {
        if (books[i] == null) continue; 

        for (int j = i + 1; j < books.length; j++) {
            if (books[j] == null) continue; 

            
            if (books[i].getPrice() == books[j].getPrice()) {
                
                boolean alreadyAdded = false;
                for (int k = 0; k < count; k++) {
                    if (matchingBooks[k] == books[i]) {
                        alreadyAdded = true;
                        break;
                    }
                }
                if (!alreadyAdded) matchingBooks[count++] = books[i];

                alreadyAdded = false;
                for (int k = 0; k < count; k++) {
                    if (matchingBooks[k] == books[j]) {
                        alreadyAdded = true;
                        break;
                    }
                }
                if (!alreadyAdded) matchingBooks[count++] = books[j];
            }
        }
    }

    // Create a result array of the correct size
    Book[] result = new Book[count];
    for (int i = 0; i < count; i++) {
        result[i] = matchingBooks[i];
    }

    return result;
}


}
public class LibraryApp
  {
     public static void main(String x[])
      {
          Scanner Sc=new Scanner(System.in);
           Book[] newBooks = new Book[5];
           Libary t1=new Libary();
           for (int i = 0; i < newBooks.length; i++) {

            newBooks[i] = new Book();

            System.out.println("Enter the ID:");
            int id = Sc.nextInt();
            Sc.nextLine();

            System.out.println("Enter the Name:");
            String name = Sc.nextLine();

            System.out.println("Enter the Price:");
            int price = Sc.nextInt();
            Sc.nextLine();

            System.out.println("Enter the Author:");
            String author = Sc.nextLine();

            newBooks[i].setId(id);
            newBooks[i].setName(name);
            newBooks[i].setPrice(price);
            newBooks[i].setAuthor(author);

            System.out.println("Book added.");
         
        }
         System.out.println("Books in the Library:\n");
         t1.addNewBooks(newBooks);
         t1.showBooks();

         System.out.printf("Enter the Search Book id:\n");
         int search=Sc.nextInt();
         Book bookfc=t1.getBookByName(search);
         if(bookfc!=null)
           {
              System.out.printf("Book Found\n");
              bookfc.displayDetails();
           }
         else
           { 
               System.out.printf("Book Not Found\n");
           }
        System.out.printf("Display the array in sorting order\n");
         Book displayBook[]=t1.getBookSortedByPrice();
         for(int i=0;i<displayBook.length;i++)
           {
              displayBook[i].displayDetails();
           }
        System.out.printf("Enter the id of book which id delete:\n");
        int delete=Sc.nextInt();
        Book bookdelete=t1.deleteBookById(delete);
         if(bookdelete!=null)
           {
              System.out.printf("Book data deleted\n");
              bookdelete.displayDetails();
           }
         else
           { 
               System.out.printf("Book data not Found");
           }
         System.out.printf("Display the data of book whose price same\n");
         Book displaySamePrice[]=t1.findBooksByPrice();
         for(int i=0;i<displaySamePrice.length;i++)
           {
              displaySamePrice[i].displayDetails();
           }
      }
  }