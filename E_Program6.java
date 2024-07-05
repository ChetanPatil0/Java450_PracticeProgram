//Area and Circumference of a Circle

class E_Program6{
    public static void main(String args[])
    {
       final float Pi = 3.14f; 
       float Radius = 2.5f; 
       

      float AreaOfCircle =  Pi * (Radius * Radius);
      float CircumOfCircle =  2 * (Pi * Radius);

      System.out.println("AREA OF CIRCLE : " + AreaOfCircle);
      System.out.println("CIRCUMFERENCE OF CIRCLE : " + CircumOfCircle);


    }
}