//64.	Input angles of a triangle and check whether the triangle is valid or not.
import java.util.Scanner;

class E_Program54{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("ENTER THE 3 ANGLES OF TRIANGLE\n");
        System.out.print("ENTER THE ANGLE 1 : ");
        int Angle1 = Sc.nextInt();
        
        System.out.print("ENTER THE ANGLE 2 : ");
        int Angle2 = Sc.nextInt();
        
        System.out.print("ENTER THE ANGLE 3 : ");
        int Angle3 = Sc.nextInt();

        int Sum = Angle1+Angle2+Angle3;

        if(Sum == 180)
        {
            System.out.println("TRIANGLE IS VALID");
        }
        else{
            System.out.println("TRIANGLE IS NOT VALID");
        }
    }
}