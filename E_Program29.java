//29.Prime Number Program in Java
import java.util.*;
class E_Program29{
   public static void main(String args[]){
     Scanner Sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER : ");
        int Number = Sc.nextInt();
        int count =0;
        for(int i = 2; i<Number; i++)
        {
            if(Number % i == 0){
                 count = 1;
            }
        }

        if(count == 1){
            System.out.println("NUMBER IS NOT PRIME ");
        }
        else{
            System.out.println("NUMBER IS PRIME ");
        }
   }
}