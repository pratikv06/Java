/**
 * Program:
 * Illustrate how to use both Integer constructor
 */

class IntegerConstructor{
   public static void main(String[] args) {
      Integer obj1 = new Integer(5);
      Integer obj2 = new Integer("6");
      int i1 = obj1.intValue();
      int i2 = obj2.intValue();
      int sum = i1 + i2;
      System.out.println("i1 = "+ i1 +"\ti2 = "+ i2 +"\nsum = " +sum);
   }
}