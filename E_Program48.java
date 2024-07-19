//leap year or not
import java.util.Scanner;
class E_Program48{
    public static void main(String args[])
    {
     Scanner Sc = new Scanner(System.in);

     System.out.print("ENTER THE NUMBER : ");
     int year = Sc.nextInt();

      if(year % 4 == 0)
      {
        System.out.print("YEAR IS LEAP YEAR");
      }
      else{
                System.out.print("YEAR IS NOT LEAP YEAR");
      }
}
}