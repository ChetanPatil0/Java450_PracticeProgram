//Calculate average of numbers using Array

class E_Program69{
    public static void main(String args[])
    {
        int array[]={1,2,4,5,3};
        int Sum=0;
        for(int i=0;i<array.length;i++)
        {
            Sum=Sum+array[i];
        }
       
        System.out.println("AVG IS : "+(Sum/array.length));
    }
}