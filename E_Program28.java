//28.	Fibonacci Series in Java
import java.util.*;
class E_Program28{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER : ");
        int Number = Sc.nextInt();

        int prev = 0;
        int current =1;
        int add = 0;
        System.out.print(prev + ",\t" + current);
        
        for(int i = 1; i<=Number; i++)
        {
            add = current + prev;
            System.out.print(",\t" + add);
            prev = current;
            current = add;
             
        }
    }
}