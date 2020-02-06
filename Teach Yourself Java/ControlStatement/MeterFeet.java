/**
 * Program:
 * Accept two command line argument
 * 1. Number
 * 2. meters or feet
 * if meter is enter, then display the number in feet or vise versa
 * if neither of this, then print "unit system is not recognized"
 * 
 * NOTE: 1 meter = 3.28 feet
 */

class MeterFeet {
   public static void main(String[] args) {
      //  Intalizing values
      int num = Integer.parseInt(args[0]);

      if(args[1].equals("meters")) {
         double feet = num * 3.28;
         System.out.print(feet +" feet");
      }
      if(args[1].equals("feet")) {
         double meters = num/3.28;
         System.out.print(meters +" meters");
      }
      if(!args[1].equals("meters") && !args[1].equals("feet")) {
         System.out.print("Unit System is not recoginzed");
      }
   }
}