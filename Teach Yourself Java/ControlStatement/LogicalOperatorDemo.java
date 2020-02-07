/**
 * Program:
 * Illustrate the boolean logic operator
 */

class LogicalOperatorDemo {
   public static void main(String[] args) {
      boolean i = Boolean.valueOf(args[0]).booleanValue();
      boolean j = Boolean.valueOf(args[1]).booleanValue();

      System.out.println("i = "+ i);
      System.out.println("j = "+ j);
      System.out.println("Logical Operators:");
      System.out.println("i & j = "+ (i&j));
      System.out.println("i | j = "+ (i|j));
      System.out.println("i ^ j = "+ (i^j));
      System.out.println("!i = "+ !i);
      System.out.println("i && j = "+ (i&&j));
      System.out.println("i || j = "+ (i||j));
      System.out.println("i == j = "+ (i==j));
      System.out.println("i != j = "+ (i!=j));
   }
}