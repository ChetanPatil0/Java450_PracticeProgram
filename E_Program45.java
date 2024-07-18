//44.	The Number Is Positive or Negative
import java.util.Scanner;
class E_Program45{
    public static void main(String srgs[])
    {
        Scanner Sc = new Scanner(System.in);

         System.out.print("ENTER THE NUMBER : ");
         int Number = Sc.nextInt();

         if(Number % 2 ==  0)
         {
            System.out.print("NUMBER IS EVEN");
         }
         else{
             System.out.print("NUMBER IS ODD");
         }

    }
}