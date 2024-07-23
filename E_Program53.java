//62.	Input month number and print number of days in that month.
import java.util.Scanner;
class E_Program53{
    public static void main(String args[])
    {
         Scanner Sc =new Scanner(System.in);

         System.out.print("ENTER THE MONTH NUMBER : ");
         int Month = Sc.nextInt();

         if(Month == 1)
         {
            System.out.println("JANUARY");
         }
        else if(Month == 2)
         {
            System.out.println("FEBRUARY");
         }
         else if(Month == 3)
         {
            System.out.println("MARCH");
         }
         else if(Month == 4)
         {
            System.out.println("APRIL");
         }
         else if(Month == 5)
         {
            System.out.println("MAY");
         }
         else if(Month == 6)
         {
            System.out.println("JUNE");
         }
         else if(Month == 7)
         {
            System.out.println("JULY");
         }
         else if(Month == 8)
         {
            System.out.println("AUGUST");
         }
         else if(Month == 9)
         {
            System.out.println("SEPTEMBER");
         }
         else if(Month == 10)
         {
            System.out.println("OCTOBER");
         }
         else if(Month == 11)
         {
            System.out.println("NOVEMBER");
         }
         else if(Month == 12)
         {
            System.out.println("DECEMBER");
         }
         else 
         {
            System.out.println("WRONG MONTH NUMBER");
         }
    }
}