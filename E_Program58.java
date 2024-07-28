//Swap two variables without using the third variable
class E_Program58{
    public static void main(String args[])
    {
        int a=66;
        int b=211;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a= "+ a + " b= "+b);
    }
}