/**
 * Program:
 * import a package using static
 */

import static java.lang.Math.*;

class StaticImport{
   public void circle(float r){
      double area = PI*r*r;
      System.out.println("Area of Circle: " +area);
   }

   public static void main(String[] args) {
      StaticImport obj = new StaticImport();
      obj.circle(2.3F); // main() is static so it can only call to static by its name in the same class
   }
}