//Count the total number of notes in a given amount.
import java.util.Scanner;
class E_Program55{

public static void main(String args[])
{
    Scanner Sc = new Scanner(System.in);

    System.out.print("ENTER THE AMOUNT : ");
    float amount = Sc.nextFloat();
    int Note500=0;
    int Note200=0;
    int Note100=0;
    int Note50=0;
    int Note20=0;
    int Note10=0;
    int Note1=0;

     for(int i=0;i<=amount;i++)
     {
        if(amount >= 500)
        {
            Note500++;
            amount=amount-500;
        }
        else if(amount >=200)
        {
            Note200++;
            amount=amount-500;
        }
        else if (amount >=100)
        {
            Note100++;
            amount=amount-100;
        }
        else if(amount >=50)
        {
            Note50++;
            amount=amount-50;
        }
        else if(amount >=20)
        {
            Note20++;
            amount=amount-20;
        }
        else if(amount>=10)
        {
            Note10++;
            amount=amount-10;
        }
        else {
            Note1++;
            amount=amount-1;
        }
     }
     int TotalNotes = Note1 + Note10 + Note20 + Note50 +  Note100 + Note200 + Note500;
     System.out.println("THE TOTAL NO OF NOTES IN GIVEN AMMOUNT IS : "+TotalNotes);
     System.out.println("1RS : "+ Note1);
     System.out.println("10RS : "+ Note10);
     System.out.println("20RS : "+ Note20);
     System.out.println("50RS : "+ Note50);
     System.out.println("100RS : "+ Note100);
     System.out.println("200RS : "+ Note200);
     System.out.println("500RS : "+ Note500);
}
}