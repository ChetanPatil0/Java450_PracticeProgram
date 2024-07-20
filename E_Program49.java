//49.	The Date Is Correct or Not
class E_Program49{
    public static void main(String args[])
    {
        int dd=30;
        int mm=12;
        int yyyy=2021;

        if(dd < 0 || dd > 31 ) 
        {
            System.out.println("DAY IS WRONG");
        }
        else if(mm < 0 || mm > 12)
        {
            System.out.println("MONTH IS WRONG");
        }
        else if(yyyy < 1600 || yyyy > 2100)
        {
             System.out.println("YEAR IS WRONG");
        }
        else{
            System.out.println("DATE IS CORRECT");
        }
    }
}
