//Find out the highest and second highest numbers in an array

class E_Program73{
    public static void main(String args[])
    {
        int array[]={1,3,5,1,4,3,7,1};
        int fmax=array[0];
        int smax=array[0];
        for(int i=0; i<array.length; i++)
        {
               if(array[i] > fmax)
               {
                  fmax = array[i];
               } 
        }
        for(int i=0; i<array.length; i++)
        {
        if(array[i] < fmax && array[i] > smax)
                {
                    smax = array[i];
                }
            
        }
        System.out.println("First Max : "+ fmax);
        System.out.println("Second Max : "+ smax);
        }

    
}