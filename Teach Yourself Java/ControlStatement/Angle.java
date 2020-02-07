/**
 * Program:
 * Calculate sine, cosine, and tangent of its command line argument
 */

class Angle {
   public static void main(String[] args) {
      if(args.length > 0) {
         double angle = Double.valueOf(args[0]).doubleValue();
         double radians = angle * Math.PI/180;
         System.out.println("Sine("+ angle +") : "+ Math.sin(radians));
         System.out.println("Cosine("+ angle +") : "+ Math.cos(radians));
         System.out.println("Tangent("+ angle +") : "+ Math.tan(radians));
      }
      else {
         System.out.println("Provide an angle in degree, as command line argument");
      }
   }
}