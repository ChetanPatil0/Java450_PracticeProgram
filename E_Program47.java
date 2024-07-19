//47.	Greatest Among Three Numbers
class E_Program47{
    public static void main(String args[])
    {
        int Number1=20;
        int Number2=352;
        int Number3=84;

        if(Number1 > Number2 && Number1 > Number3)
        {
             System.out.println("NUMBER 1 IS GREATER");
        }
        else if(Number2 > Number3)
        {
            System.out.println("NUMBER 2 IS GREATER");
        }
        else{
            System.out.println("NUMBER 3 IS GREATER");
        }
    }
}