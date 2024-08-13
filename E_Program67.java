//Sort A Float Array In Ascending And Descending Order Using for loop

class E_Program67{
    public static void main(String args[])
    {
      float [] Array={5.3f,4.29f,4.28f,1.5f,6.9f,3.2f};
      float Temp=0.0f;
      for(int i=0; i<Array.length; i++)
      {
         for(int j=i+1;j<Array.length;j++)
         {
            if(Array[i]>Array[j])
            {
               Temp=Array[j];
               Array[j]=Array[i];
               Array[i]=Temp;
            }
         }
      }
   for(int i=0;i<6;i++){
         System.out.print(Array[i]+" - ");
   }


    }
}


