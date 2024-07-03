//4.Calculate power of a number
class E_Program4{
    public static void main(String args[])
    {
        int base=4;
        int exponent=3;
        int power =1;
        for(int i=0;i<exponent;i++)
        {
             power =power * base;
        }
        System.out.println("Power Is : " + power);
    }
}