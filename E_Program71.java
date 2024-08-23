//3.Sort an array in ascending order

class E_Program71{
    public static void main(String args[])
    {
        int array[]={8,3,6,1,4,3};
        
        for(int i=0; i<array.length; i++)
        {
        for(int j=i+1; j<array.length; j++)
        {
          if(array[i] > array[j])
          {
             int temp = array[i];
             array[i] = array[j];
             array[j]=temp;
          }
        }
        }

        for(int i=0;i<array.length;i++)
        {
            System.out.print(" " + array[i]);
        }
    }
}