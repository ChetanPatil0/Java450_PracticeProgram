//74.	Display prime numbers between 1 and N
import java.util.Scanner;
class E_Program57{
    public static void main(String main[])
    {
       Scanner Sc= new Scanner(System.in);
       
       System.out.print("ENTER THE NUMBER : ");
       int Number=Sc.nextInt();

       int count = 0;
        for (int i=2;i<Number;i++)
        {
            if(Number % i == 0)
            {
                count = 1;
            }
        
        }
        if(count == 1)
        {
            System.out.println("NUMBER IS NOT PRIME ");
        }
        else{
            System.out.println("NUMBER IS PRIME ");
        }
    }
}