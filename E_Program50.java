//50.	Voting Eligibility Checker
import java.util.Scanner;
class E_Program50{
    public static void main(String args[])
    {
          Scanner Sc = new Scanner(System.in);

          System.out.print("ENTER THE AGE : ");
          int Age = Sc.nextInt();

          if(Age >= 18)
          {
            System.out.print("ELIGIBLE FOR VOTING");
          }
          else{
            System.out.print("NOT ELIGIBLE FOR VOTING");
          }
    }
}