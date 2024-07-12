//32.	Armstrong Number in Java
import java.util.Scanner;
class E_Program32{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER : ");
        int Number = Sc.nextInt();
        int Num = Number;
         int Rem=0;
         int Sum=0;
         for(int i=0;Number>0;i++)
         {
            Rem = Number % 10;
            Sum =Sum+ (Rem * Rem * Rem);
            Number =Number/10;
         }  
         if(Num == Sum)
         {
            System.out.print("NUMBER IS ARMSTRONG");
         }
         else{
            System.out.print("NUMBER IS NOT ARMSTRONG");
         }

    }
}
