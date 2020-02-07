/**
 * Program:
 * Accept two command line argument,
 * Illustrate the use of relational operators.
 */

class RelationalOperatorDemo {
   public static void main(String[] args) {
      int i = Integer.parseInt(args[0]);
      int j = Integer.parseInt(args[1]);

      System.out.println("i = "+ i);
      System.out.println("j = "+ j);
      System.out.println("Relational Operator::");
      System.out.println("i < j = "+ (i<j));
      System.out.println("i <= j = "+ (i<=j));
      System.out.println("i == j = "+ (i==j));
      System.out.println("i > j = "+ (i>j));
      System.out.println("i >= j = "+ (i>=j));
      System.out.println("i != j = "+ (i!=j));
   
   }
}