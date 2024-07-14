//41.Character Is Vowel or Consonant
import java.util.Scanner;
class E_Program41{
    public static void main(String args[])
   {    
    Scanner Sc = new Scanner(System.in);

    System.out.print("ENTER THE CHARACTER : ");
    char Character = Sc.next().charAt(0);

    if(Character == 'a' || Character == 'e' || Character == 'i' || Character == 'o' || Character == 'u' 
     || Character == 'A' || Character == 'E' || Character == 'I' || Character == 'O' || Character == 'U' )
     {
        System.out.print("CHARACTER IS VOWEL");
     }
     else{
        System.out.print("CHARACTER IS CONSONANT");
     }

}
}