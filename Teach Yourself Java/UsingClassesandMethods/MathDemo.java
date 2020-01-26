/**
 * Program:
 * illustrate how to use some of the static methods and static variable
 *  of the Math class
 * 
 */

class MathDemo{
   public static void main(String[] args) {
      System.out.println("   Displaying value of static variable:");
      System.out.println("1. E = " + Math.E);
      System.out.println("2. PI = " + Math.PI);

      System.out.println("\n   Computing area and circumference of circle:");
      double r = 5;
      double area = Math.PI *  r * r;
      double cir = 2 * Math.PI * r;
      System.out.println("1. Radius = " +r);
      System.out.println("2. Area = " +area);
      System.out.println("3. Circumference = " + cir);

      System.out.println("\n   Square root:");
      System.out.println("1. Square root of 23.45 is " + Math.sqrt(23.45));

      System.out.println("\n   Calculating power:");
      System.out.println("1. The value of 2 raised to the power 12 is " + Math.pow(2,12));

      System.out.println("\n   Computing Hypotenuse of the right angled triangle:");
      double side1 = 4.5;
      double side2 = 8.9;
      // c^2 = a^2 + b^2
      side1 = Math.pow(side1, 2);
      side2 = Math.pow(side2, 2);
      double side3 = Math.sqrt((side1 + side2));
      System.out.println("1. Side1 = 4.5 and side2 = 8.9, then hypotenuse is " + side3);

      System.out.println("\n   Some other functions:");
      System.out.println("1. Max of -8 and -4 is " + Math.max(-8, -4));
      System.out.println("2. Min of -8 and -4 is " + Math.min(-8, -4));
      System.out.println("3. Absolute value of -18 is " + Math.abs(-18));
      System.out.println("4. The ceiling of 45.7 is " + Math.ceil(45.7));
      System.out.println("5. The floor of 45.7 is " + Math.floor(45.7));

      
   }
}