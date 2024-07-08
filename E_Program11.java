//11.Read Integer (N) and Print the First Three Powers (N^1, N^2, N^3)
class E_Program11{
    public static void main(String args[])
    {
       int Number = 4;
       int Power =1;
       for(int i=1;i<=3;i++)
       {
        Power = Power * Number;
          System.out.println("N ^ " + i +" is : " + Power);
       }
    }
}