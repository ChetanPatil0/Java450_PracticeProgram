//5.swap a number without third vaiable and with third variable
class E_Program5{
    public static void main(String args[])
    {
       int a=20;
       int b=10;
       int c=0;
                   
       c=a;
       a=b;
       b=c;

       System.out.println("a : "+ a + " b : " + b); // With 3rd variable  

       a=a+b;
       b=a-b;
       a=a-b;
       System.out.println("a : "+ a + " b : " + b); // Without 3rd variable  
   
    }
}