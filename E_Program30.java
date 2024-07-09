//30.Palindrome Program in Java
class E_Program30{
       public static void main(String args[])
       {
        int Number = 121;
        int Num = Number;
        int Rem=0;
        int Rev=0;
        
        while( Number > 0)
        {
              Rem = Number % 10;
              Rev = Rem + (Rev * 10);
              Number = Number /10;
        }
       
       if(Num == Rev)
       {
            System.out.println("Number Is Palindrome");
       }
       else{
            System.out.println("Number Is Not Palindrome");
       }

       }
}