
import java.util.*;
class Player{
  private int id;
  private String name;
  private int age;
  private int run;

  public void setId(int idd)
   {
    id=idd;
   }
 public int getId()
 {
   return id;
 }
 public void setName(String nem)
  {
     name=nem;
  }
 public String getName()
  {
     return name;
  }
 public void setAge(int ag)
  {
     age=ag;
  }
 public int getAge()
 {
    return age;
 }
 public void setRun(int ru)
  {
     run=ru;
  }
 public int getRun()
 {
    return run;
 }
 public void displayDetails() {
        System.out.printf("ID: %d | Name: %s | Age: %d | Run: %d \n", id, name, age,run);
    }
}
public class PlayerApp
  {
     public static void main(String x[])
      {
          Scanner Sc=new Scanner(System.in);
          Player pr[]=new Player[3];
          for(int i=0;i<pr.length;i++)
            {
                pr[i]=new Player();
                System.out.printf("Enter the Id:\n");
                int idd=Sc.nextInt();
                Sc.nextLine();
                System.out.printf("Enter the Name:\n");
                String nem=Sc.nextLine();
                System.out.printf("Enter the Age:");
                int ag=Sc.nextInt();
                System.out.printf("Enter the Run");
                int ru=Sc.nextInt();
               
                pr[i].setId(idd);
                pr[i].setName(nem);
                pr[i].setAge(ag);
                pr[i].setRun(ru);

            }
           System.out.printf("Sort the player based on descending order\n");
           for(int i=0;i<pr.length;i++)
              {
                 for(int j=i+1; j<pr.length;j++)
                      {
                         if(pr[i].getRun()<=pr[j].getRun())
                           {
                               Player temp=pr[i];
                                   pr[i]=pr[j];
                                   pr[j]=temp;
                           }
                      }
              }
           for(int i=0;i<pr.length;i++)
              {
                  pr[i].displayDetails();
              } 
         
          boolean playerFound = false;

        System.out.println("\nPlayers with Runs >= 1000 and Age >= 25:");
        for (int i = 0; i < pr.length; i++) {
            if ((pr[i].getRun() >= 1000) && (pr[i].getAge()>=25)) {
                pr[i].displayDetails();
                playerFound = true;
               }
            }

               if (!playerFound) {
              System.out.println("No player found with the specified Run and Age.");
              }
         
      }
  }