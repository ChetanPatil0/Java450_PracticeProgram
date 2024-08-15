//Print Fibonacci series till n
import java.util.Scanner;
class E_Program60{
    public static void main(String args[])
    {
        Scanner Sc =new Scanner(System.in);
        System.out.print("ENTER THE Nth NUMBER : ");
        int Number = Sc.nextInt();
       int Prev=0;
       int Curr=1;
       int add=0;
       System.out.println("Fibonacci Series Of Number "+Number);
       System.out.print(Prev + " " + Curr);
        for(int i=2;i<=Number;i++)
        {
           add = Prev + Curr;
           System.out.print(" "+add);
           Prev=Curr;
           Curr=add;
        }
    }
}