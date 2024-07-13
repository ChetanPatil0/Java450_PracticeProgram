//40.The Number Is Positive or Negative
import java.util.Scanner;
class E_Program40{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER : ");
        int Number = Sc.nextInt();

        if(Number >=0)
        {
           System.out.print("NUMBER IS POSITIVE ");
        }
        else{
            System.out.print("NUMBER IS NEGATIVE ");
        }
    }
}