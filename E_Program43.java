//43.A Character Is Uppercase, Lowercase, Special Character, or Digit
import java.util.*;
class E_Program43{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);


        System.out.print("ENTER THE CHARACTER : ");
        char Character = Sc.next().charAt(0);
        int CharVal = Character;

            if(CharVal >= 48 && CharVal <= 57)
            {
                System.out.print("Character Is an Digit");
            }
           else if(CharVal >= 65 && CharVal <= 90)
            {
                System.out.print("Character Is an UpperCase Alphabet");
            }
            else if(CharVal >= 97 && CharVal <= 122)
            {
                System.out.print("Character Is an LowerCase Alphabet");
            }
            else
            {
                System.out.print("Character Is an Special Character");
            }
        
    }
}