/**
 * Program:
 * Application of Constructor
 * 
 * NOTE:
 *    1. Constructor have the same name as the class itself
 *    2. Do not have a return type, not even "void"
 *    3. They return the instance of the itself, So no need to specify
 */
class Rectangle{
   int length, width;

   Rectangle (int x, int y){ // Parameterised Constructor
      length = x;
      width = y;
   }

   int rectArea(){
      return (length*width);
   }
}

 class ContructorMethod{
    public static void main(String[] args) {
       Rectangle rect1 = new Rectangle(15, 10);
       int area = rect1.rectArea();
       System.out.println("Area = " +area);
    }
 }