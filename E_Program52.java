//54.	Check whether a number is divisible by 5 and 11 or not
import java.util.Scanner;
class E_Program52{
    public static void main(String args[])
    {
       Scanner Sc = new Scanner(System.in);

          System.out.print("ENTER THE NUMBER : ");
          int Number = Sc.nextInt();

        if(Number % 5 == 0 && Number % 11 == 0)
        {
            System.out.print("NUMBER IS DIVISIBLE BY 5 AND 11");
        }
        else{
            System.out.print("NUMBER IS NOT DIVIDIBLE BY 5 AND 11");
        }
    }
     
}