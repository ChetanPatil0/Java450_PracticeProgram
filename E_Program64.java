//Count Number of Digits of an Integer
class E_Program64{
    public static void main(String args[])
    {
        int Number=1234567891;
        int Count=0;
         

        while(Number != 0)
        {
            Count++;
            Number = Number /10;
        }
        System.out.print("Number Of Digit : "+ Count);
    }
}