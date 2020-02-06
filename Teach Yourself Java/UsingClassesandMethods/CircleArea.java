/**
 * Program:
 * Accept radius of circle as command line argument,
 * and display the area of this shape
 */

class CircleArea {
   public static void main(String[] args) {
      // Get Radius
      double r = Double.parseDouble(args[0]);

      // Calulating area of cirlce
      double area = 3.14 * r * r;
      System.out.println("Area of circle is "+ area);
   }
}