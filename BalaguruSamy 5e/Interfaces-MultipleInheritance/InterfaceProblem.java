/**
 * Program:
 * Implementing Interface
 */

interface Area{
   final static float pi = 3.14F;
   float compute(float x, float y);
}

class Rectangle implements Area{
   public float compute(float x, float y){
      return (x * y);
   }
}

class Circle implements Area{
   public float compute(float x, float y){
      return (pi*x*x);
   }
}

class InterfaceProblem{
   public static void main(String[] args) {
      Area rect = new Rectangle();
      Area cir = new Circle();

      System.out.println("Area of Rectangle: " +rect.compute(10,20) +" sq.unit");
      System.out.println("Area of Circle: " +cir.compute(10,0) +" sq.unit");


   }
}