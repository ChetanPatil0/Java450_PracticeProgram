//42.A Character Is an Alphabet or Not
import java.util.*;
class E_Program42{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);


        System.out.print("ENTER THE CHARACTER : ");
        char Character = Sc.next().charAt(0);
        int CharVal = Character;
        int Count=0;
        for(int i=65; i<=122; i++)
        {
            if(CharVal == i)
            {
                Count=1;
                break;
            }
        }
        if(Count == 1){
            System.out.print("Character Is an Alphabet");
        }
        else{
            System.out.print("Character Is Not Alphabet");
        }
    }
}