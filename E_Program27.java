// 27.	Java Program to Find Square and Cube of a Number (N^1,N^2, N^3)
import java.util.Scanner;
class E_Program27{
    public static void main(String args[])
    {
         Scanner Sc = new Scanner(System.in);

         System.out.print("ENTER THE NUMBER : ");
         int Number = Sc.nextInt();
         int Result =1;
          for(int i=1;i<=3;i++)
          {
             Result = Result * Number;
             if(i==2)
             {
                System.out.println("SQUARE IS :" + Result);
             }
             else if(i==3){
                System.out.println("CUBE IS :" + Result);
             }
             else{
                System.out.println("N^1 : " + Result);
             }
          }
  
    }
}