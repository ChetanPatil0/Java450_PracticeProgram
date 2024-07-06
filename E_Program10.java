//10.Factorial of a Given Number
import java.util.*;
class E_Program10{
    public static void main(String args[]){
            Scanner Sc = new Scanner(System.in);
             int Factorial=1;
            System.out.print("ENTER THE NUMBER : ");
            int Number = Sc.nextInt();
            

           for(int i=Number; i>0;i--){
               
               Factorial = Factorial  * i;
           }

        System.out.println("FACTORIAL OF GIVE NUM IS : " + Factorial);

    }
}