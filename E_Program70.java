//2.	Reverse an array
class E_Program70{
    public static void main(String args[])
    {
        int array[]={1,3,6,8,4};

        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j < i;j++){
                int temp = array[i];
               array[i] = array[j];
               array[j]=temp;
            }
        }
    
    for(int i=0;i<array.length;i++)
        {
            System.out.print(" " + array[i]);
        }
    }
}