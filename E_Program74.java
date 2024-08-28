//Java Program to copy all elements of one array into another array
class E_Program74{
    public static void main(String[] args)
    {
        int array1[]={1,2,3,4,5};
        int array2[]=array1;

        for(int i=0; i<array2.length; i++)
        {
            System.out.println(array2[i]);
        }
        
    }
}