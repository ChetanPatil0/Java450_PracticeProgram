//38.	Calculate area and circumference of circle using multiple classes
class Rectangle{
    float Radius=0;
    public static float PI =3.14f; 
    public Rectangle(float Radius)
    {
        this.Radius = Radius;
    }
    public void Area(){
       float AreaOfCircle=PI * Radius * Radius;
       System.out.println("Area : "+ AreaOfCircle);
    }

    public void Circumference(){
        float CircumOfCircle = 2 * PI * Radius;
        System.out.println("Circumference  : "+ CircumOfCircle);
    }
}
class  E_Program38{
      public static void main(String args[]){
         Rectangle Rect1 =new Rectangle(2.5f);
         Rect1.Area();
         Rect1.Circumference();
      }
}