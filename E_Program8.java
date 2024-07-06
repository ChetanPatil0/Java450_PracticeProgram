//8. Simple Interest
class E_Program8{
    public static void main(String args[])
    {
        float SimpleInterest=0f;
        float Principle = 1000f; 
        float Rate = 8f;
        int Terms = 24;

         SimpleInterest = (Principle + Rate + Terms) / 100;
        System.out.print("SIMPLE INTEREST IS : " + SimpleInterest);
    }
}