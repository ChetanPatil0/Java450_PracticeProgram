//39.The Greatest Number Among the Given Three Number
import java.util.Scanner;
class E_Program39{
public static void  main(String args[])
{
    Scanner Sc = new Scanner(System.in);
    

    System.out.print("ENTER THE NUMBER 1 : ");
    int Num1 = Sc.nextInt();

    System.out.print("ENTER THE NUMBER 2 : ");
    int Num2 = Sc.nextInt();

    System.out.print("ENTER THE NUMBER 3 : ");
    int Num3 = Sc.nextInt();

    if(Num1 > Num2 && Num1 > Num3)
    {
        System.out.println("GREATER NO IS "+ Num1);
    }
    else if(Num2 > Num3)
    {
     System.out.println("GREATER NO IS "+ Num2);   
    }
    else{
        System.out.println("GREATER NO IS "+ Num3);
    }
}
}