//31.Factorial Program in Java
import java.util.*;
class E_Program31{
    public static void main(String args[])
{
    Scanner Sc = new Scanner(System.in);

    System.out.print("ENTER THE NUMBER : ");
    int Number = Sc.nextInt();

    System.out.print(Number+"!: ");
    for(int i=Number;i>0;i--)
    {
           System.out.print(" "+i);
    }
}
}