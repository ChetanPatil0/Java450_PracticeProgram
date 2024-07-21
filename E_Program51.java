//61.	Input week number and print weekday.
import java.util.Scanner;
class E_Program51{
    public static void main(String args[])
    {
       Scanner Sc = new Scanner(System.in);

          System.out.print("ENTER THE WEEK NUMBER : ");
          int Week = Sc.nextInt();

          if(Week == 1)
          {
            System.out.println("Monday");
          }
        else if(Week == 2)
          {
            System.out.println("Tuesday");
          }
          else if(Week == 3)
          {
            System.out.println("Wednesday");
          }
          else if(Week == 4)
          {
            System.out.println("Thrusday");
          }
          else if(Week == 5)
          {
            System.out.println("Friday");
          }
          else if(Week == 6)
          {
            System.out.println("Saturday");
          }
          else if(Week == 7)
          {
            System.out.println("Sunday");
          }
          else{
            System.out.println("Wrong Number");            
          }
    }
}