//Print A Calendar Taking Input From User Using Loop
import java.util.Scanner;
class E_Program65{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);

        System.out.print("ENTER THE MONTH NUMBER : ");
        int Month = Sc.nextInt();
        int Day=1;
        int Days=31;
        if(Month == 2)
            {
                Days=29;
            }
            else if(Month == 4 || Month == 6 || Month == 9|| Month == 11)
            {
                Days=30;
            }
            else{
                 Days=31;
            }
        while( Day <= Days)
        {
            System.out.print( "\t"+Day);
            if(Day % 7 ==0)
            {
                System.out.println("");
            }
            Day++;
        }
    }
}