//68.	Calculate profit or loss.
import java.util.Scanner;
class E_Program56{
    public static void main (String args[])
    {
       Scanner Sc= new Scanner(System.in);
       
       System.out.print("ENTER THE BUYING AMOUNT : ");
       float BuyAmt=Sc.nextFloat();

       System.out.print("ENTER THE SELLING AMOUNT : ");
       float SellAmt=Sc.nextFloat();


       float PL = SellAmt - BuyAmt;

       if(SellAmt > BuyAmt)
       {
        System.out.println("PROFIT IS RS : "+ PL);
       }
       else{
        System.out.println("LOSS IS RS : "+ PL);
       }
    }
}