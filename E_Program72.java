//Java Program to print the duplicate elements of an array

class E_Program72{
    public static void main(String args[])
    {
        int array[] = {1,2,4,5,2,7,5,1};
    
         for(int i=0;i<array.length; i++)
         {
            for(int j=i+1;j<array.length; j++)
            {
               if(array[i]==array[j])
               {
                  System.out.print(array[i] + " ");
               }
            }
         }
    }
}